package com.example.kotlinbasics

fun main() {

    val myString1 = "myNombreEs"
    val myString2 = "My nombre es"
    val myString3 = "MyNombreEs"
    val camelCaseString1 = myString1.toCamel()
    println(camelCaseString1)
    val camelCaseString2 = myString2.toCamel()
    println(camelCaseString2)
    val camelCaseString3 = myString3.toCamel()
    println(camelCaseString3)

}

// My nombre es  -> My_nombre_es
// MyNombreEs  -> My_nombre_es
// myNombreEs  -> My_nombre_es



fun String.toCamel(): String {
    val myString = this

    val first = myString.replace(" ", "_")

    val pattern = "(?<=.)[A-Z]".toRegex()
    val second = myString.replace(pattern, "_$0")

    return if (!myString.contains(" ")) second else first

}