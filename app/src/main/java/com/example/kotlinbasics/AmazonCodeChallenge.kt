package com.example.kotlinbasics

fun main() {
    val array = arrayOf(arrayOf("hello", "world"), arrayOf("welcome", "to", "kotlin"))
    val wordToSearch = "kotlin"

    val coordinates = searchWord(array, "to")
    if (coordinates.isNotEmpty()) {
        println("The word $wordToSearch is found at the following positions:")
        for (coordinate in coordinates) {
            println("Row ${coordinate.first}, Column ${coordinate.second}")
        }
    } else {
        println("The word $wordToSearch is not found in the array.")
    }
}


fun searchWord(array: Array<Array<String>>, word: String): List<Pair<Int, Int>> {
    val coordinates = mutableListOf<Pair<Int, Int>>()
    for (row in array.indices) {
        for (col in array[row].indices) {
            if (array[row][col] == word) {
                coordinates.add(row to col)
            }
        }
    }
    return coordinates
}