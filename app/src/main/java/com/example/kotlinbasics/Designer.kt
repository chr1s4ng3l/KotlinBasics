package com.example.kotlinbasics



class Designer(name: String, age: Int): Persona(name, age), Drive, Language {

    override fun work() {
        println("The designer is working")
    }

    override fun goToWork() {
        println("$name va a Photoshop")
    }

    override fun Vehicle() {
        println("$name drive a Mercedes Benz")
    }

    override fun walk() {
        println("$name loves to walk to work")
    }
    override fun information() {
        println("Name: $name Age: $age")
    }

    override fun java() {

    }

    override fun designTool() {
        println("$name loves use Canva")
    }
}