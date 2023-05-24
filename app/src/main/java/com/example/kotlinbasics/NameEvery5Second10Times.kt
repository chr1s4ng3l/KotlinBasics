package com.example.kotlinbasics

import java.util.*
import kotlin.concurrent.timerTask

fun main() {

    var count = 0

    val timer = Timer()
    val task = timerTask{
        println("Christopher")
        count++

        if(count == 10){
            timer.cancel()
        }

    }

    //Scheduler
    timer.schedule(task,  0L, 5000L)



}