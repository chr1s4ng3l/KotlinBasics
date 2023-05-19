package com.example.kotlinbasics


fun main() {
    val input = "aabbdd"

    println(input.toRemoveDuplicateValues())
}


fun String.toRemoveDuplicateValues(): String {
    val input = this.split("")
    val charCountMap = input.groupingBy { it }.eachCount()

    var a = ""
    input.forEach {
        if (charCountMap[it] == 1){
            a += it
        }
    }
    return a
}
