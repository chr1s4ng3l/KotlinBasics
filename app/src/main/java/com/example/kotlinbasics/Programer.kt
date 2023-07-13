package com.example.kotlinbasics

class Programer( name: String, age: Int) : Persona(name, age), Drive, Language {


    override fun work() {
        println("The Programmer is working")
    }

    override fun goToWork() {
        println("$name va a Enhance It")
    }

//    override fun Vehicle() {
//        println("$name drive a BMW")
//    }

    override fun information() {
        println("Name: $name Age: $age")
    }

    override fun java() {
        println("$name loves programing in Java")
    }

    override fun designTool() {

    }

}
