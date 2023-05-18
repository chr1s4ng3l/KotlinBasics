package com.example.kotlinbasics

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


//fun com.example.kotlinbasics.main() = runBlocking<Unit> {
//    val result = diamondThread()
//    println("Result: $result")
//}

//suspend fun diamondThread(): Int {
//    val input = 10
//    val deferred1 = async { task1(input) }
//    val deferred2 = async { task2(input) }
//    val deferred3 = async { task3(deferred1.await(), deferred2.await()) }
//    return deferred3.await()
//}
//
//suspend fun task1(input: Int): Int {
//    println("Executing task 1...")
//    delay(1000)
//    return input * 2
//}
//
//suspend fun task2(input: Int): Int {
//    println("Executing task 2...")
//    delay(1000)
//    return input + 5
//}
//
//suspend fun task3(result1: Int, result2: Int): Int {
//    println("Executing task 3...")
//    delay(1000)
//    return result1 + result2
//}