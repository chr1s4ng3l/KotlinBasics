package com.example.kotlinbasics

//fun solve(arr: Array<Int>): Long {
//    var result = 0L
//    val n = arr.size
//
//    for (i in 0 until n) {
//        for (j in i until n) {
//            result += arr[i] and arr[j]
//
//        }
//    }
//    return result
//
//}
//
//fun main() {
//
//    val arr = arrayOf(1,2,3)
//    val result = solve(arr)
//    println(result)
//}
//

fun calculateAndProductSum(arr: ArrayList<Int>): Long {
    val n = arr.size
    var sum: Long = 0

    for (i in 0 until n) {
        var andProduct = arr[i].toLong()

        for (j in i until n) {
            andProduct = andProduct.and(arr[j].toLong())
            sum += andProduct
        }
    }

    return sum
}

fun main() {
    val arr: ArrayList<Int> = arrayListOf(1, 4)
    val result = calculateAndProductSum(arr)
    println(result)
}

