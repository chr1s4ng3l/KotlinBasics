package com.example.kotlinbasics

fun main() {
    //Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
    //Output : arr[] = {1, 2, 3, 6, 0, 0, 0};

    val intArray = intArrayOf(1, 2, 0, 0, 0, 3, 6)

    moveZeroElement(intArray)

    println(intArray.contentToString())


}

fun moveZeroElement(arr: IntArray) {
    var count = 0

    // Traverse the array
    for (i in arr.indices) {
        println("Value of i: => ${arr[i]}")

        // If the current element is non-zero
        if (arr[i] != 0) {
            // Move it to the front of the array
            arr[count++] = arr[i]
            println("Moving non-zeros")
            println(arr.contentToString())

        }
    }

    println(count)


    // Fill the remaining positions with zeros
    while (count < arr.size) {
        arr[count++] = 0
        println(count)
        println("Start filling 0")
        println(arr.contentToString())

    }
}
