package com.example.kotlinbasics

fun funGame(a: Array<Int>, b: Array<Int>, move: Int): String {
    // Write your code here


    var message = ""

    var remain = move
    val a1 = a.sortedArrayDescending()
    val b1 = b.sortedArrayDescending()
    var p1 = 0
    var p2 = 0

    //[4,5, : 3,3 : 1,1  ]
    val mix = a1.zip(b1)

    for ((aa1, bb1) in mix) {

        if (remain > 0) {
            p1 += aa1
            remain--
        } else {
            break
        }
        if (remain > 0) {
            remain--
            p2 += bb1
        } else {
            break
        }

    }


    message = if (p1 == p2) "Tie"
    else if (p1 > p2) "First"
    else "Second"



    return message

}

fun main() {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        val result = funGame(a, b, n.toInt())

        println(result)
    }
}