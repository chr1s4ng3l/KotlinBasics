package com.example.kotlinbasics

fun main() {

    val os = OrderedStream(5)
    println(os.insert(3, "c")) // prints []
    println(os.insert(1, "a")) // prints []
    println(os.insert(2, "b")) // prints ["a", "b"]
    println(os.insert(5, "e")) // prints []
    println(os.insert(4, "d")) // prints ["c", "d", "e"]
    println(os.getOrderedItems()) // prints ["a", "b", "c", "d", "e"]

}


class OrderedStream(private val n: Int) {
    // An array to store the items in the stream
    private val stream = Array<String?>(n) { null }
    // A variable to keep track of the last processed item
    private var ptr = 0

    // Insert a new item into the stream at the specified ID
    fun insert(id: Int, value: String): List<String> {
        // Store the item in the stream array at the specified ID
        stream[id - 1] = value
        // A list to hold the contiguous items that have been inserted
        val res = mutableListOf<String>()
        // If the inserted ID is contiguous with the previously inserted items
        if (id == ptr + 1) {
            // Process all the contiguous items
            while (ptr < n && stream[ptr] != null) {
                // Add the item to the result list
                res.add(stream[ptr]!!)
                // Update the pointer to the last processed item
                ptr++
            }
        }
        // Return the list of contiguous items that have been inserted
        return res
    }

    // Get all the items that have been inserted into the stream in order
    fun getOrderedItems(): List<String> {
        // A list to hold the ordered items
        val res = mutableListOf<String>()
        // Add all the items before the last processed item to the result list
        for (i in 0 until ptr) {
            res.add(stream[i]!!)
        }
        // Return the list of ordered items
        return res
    }
}
