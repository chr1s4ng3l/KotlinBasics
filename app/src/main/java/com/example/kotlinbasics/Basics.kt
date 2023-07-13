package com.example.kotlinbasics

import java.util.*
import kotlin.concurrent.timerTask

fun main() {


    var count = 0
    val timer = Timer()
    val task = timerTask {
        println("Christopher")
        count ++
        if (count == 10){
            timer.cancel()
        }

    }

    timer.schedule(task, 0L, 5000L)

//
//    var count = 0
//    val timer = Timer()
//    val task = timerTask {
//        println("Hola")
//        count++
//        if (count == 10) {
//            timer.cancel()
//        }
//    }
//    timer.schedule(task, 0L, 5000L)

//
//    val arrayList = ArrayList<Double>()
//    arrayList.add(3.3)
//    arrayList.add(5.2)
//    arrayList.add(10.5)
//    arrayList.add(20.2)
//    arrayList.add(5.5)
//    var total: Double = 0.0
//
//    for (i in arrayList) {
//        println(i)
//        total += i
//    }
//    var average = total / arrayList.size
//
//    println("=========")
//    println("Total: $total")
//    println("Average: $average")
//
//
//    //lambda expression
//    println("=============")
//    val sum = {
//            a: Int, b: Int
//        -> println(a + b)
//    }
//    sum(10, 15)
//


    //classInheritance()

    /* var myCar = Car()
     myCar.owner
     println("Brand of my car: ${myCar.myBrand}")


     */
//whileLopp()

    //  var result = sum(5,10)
    // println("Result is: $result")

    //phone("Android", "Samsung", "Galaxy S10", "Black", 2002)

    /* val Iphone = phone("Ios", "Apple", "Iphone 14", "Red", 2020, 10)
     Iphone.color = "Golden"
     Iphone.year = 2023
     Iphone.stateInf()
     Iphone.chargeBattry(40)

     val Pixel = phone("Android native", "Google", "Pixel 6", "Silver", 2022, 20)
     Pixel.color = "Balck"
     Pixel.year = 2024
     Pixel.stateInf()
     Pixel.chargeBattry(10)

     val BlacBerry = phone("Windows", "Verizon", "Black Berry", "Brown", 2005, 40)
     BlacBerry.color = "White"
     BlacBerry.year = 2007
     BlacBerry.stateInf()
     BlacBerry.chargeBattry(5)


     */

}

private fun classInheritance() {

    var programer = Programer("Christopher", 24)
    programer.information()
   // programer.Vehicle()
    programer.goToWork()
    programer.work()
    programer.java()
    println("==========================")
    var designer = Designer("Luis", 28)
    designer.information()
    designer.goToWork()
    designer.walk()
    designer.work()
    designer.designTool()


}

class Car {
    lateinit var owner: String
    val name: Any by lazy { "Jose" }

    val myBrand: String = "MERCEDES BENZ"
        //Custom getter
        get() {
            return field.lowercase()
        }

    init {
        this.owner = "Christopher"
    }
}


class phone(type: String = "Hybrid", brand: String = "Huawei", model: String = "Mate 30") {

    //member variables
    var model: String? = null
    var year: Int? = null
    var color: String? = null
    var battery: Int = 20

    init {
        this.model = model
        println("------------")
        println("Type: $type")
        println("Brand: $brand")
        println("Model: $model")
    }


    fun chargeBattry(addBattery: Int) {
        this.battery += addBattery
        println("Battery charged: $battery% you added $addBattery%")
    }

    //Primary constructor
    fun stateInf() {
        println("$model\'s color is $color")
    }

    //Secondary constructor
    constructor(type: String, brand: String, model: String, color: String, year: Int, battery: Int)
            : this(type, brand, model) {

        this.battery = battery
        this.color = color
        this.year = year

        println("===============")
        println("Type: $type")
        println("Brand: $brand")
        println("Model: $model")
        println("Color: $color")
        println("Year: $year")
        println("Battery: $battery")
    }

}


fun sum(a: Int, b: Int): Int {
    return a + b
}

fun whileLopp() {

    /*   var humidity = "humid"
       var humidityLevel = 80

       while(humidity == "humid"){
            humidityLevel -= 5
           println("Humidity decreased")
           if(humidityLevel < 60){
               humidity = "it's comfy now"
           }
           println("$humidityLevel $humidity")
       }*/

    /*for (num in 1..100){
        if (num <= 50){
            continue
        }
        println("$num")
    }
    println("Break push")*/

}