package com.example.kotlinbasics

open class Persona(val name: String, val age: Int) : work() {

    open fun work(){
        println("The person is working")

    }

    override fun goToWork() {
        println("This person go to work")
    }

    override fun goToSleep() {
        println("Time")
    }

    open fun information(){
        println("Name: $name Age: $age")
    }


}
