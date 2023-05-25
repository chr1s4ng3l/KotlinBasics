package com.example.kotlinbasics

import android.annotation.SuppressLint
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter

@SuppressLint("SimpleDateFormat")
fun main() {


    val parse = SimpleDateFormat("hh:mm:ss a")

    val b = parse.parse("07:01:00 PM")

    println(b)

}