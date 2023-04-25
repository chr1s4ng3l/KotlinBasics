package com.example.kotlinbasics

fun main(){


    val myArray = arrayOf(1,3,3,3)

    println(myArray.toString())
    println(myArray.toExt())

}



/**
 * Returns the number of unique elements in this array.
 *
 * @return the number of unique elements in this array
 */
 fun Array<Int>.toExt(): Int {
    // Sort the array to group equal elements together
    val array = this.sorted()
    // Initialize the fold operation with a null previous element and a count of 0
    val initial = Pair(null as Int?, 0)
    // Use fold to count the number of unique elements
    val reduced = array.fold(initial) { (prev, count), curr ->
        // If the current element is equal to the previous element, don't increment the count
        // Otherwise, increment the count by 1
        Pair(curr, if (prev == curr) count else count + 1)
    }
    // Return the count of unique elements
    return reduced.second
}

