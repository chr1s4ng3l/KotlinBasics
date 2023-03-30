package com.example.kotlinbasics

fun main() {

    val mys = "myNombreEs"

    print(mys.toCamel())

}

// My nombre es  -> My_nombre_es
// MyNombreEs  -> My_nombre_es
// myNombreEs  -> My_nombre_es



fun String.toCamel(): String {
    val myString = this

    val first = myString.replace(" ", "_")

    val pattern = "(?<=.)[A-Z]".toRegex()
    val second = myString.replace(pattern, "_$0")

    return if (!myString.contains(" ")){
        second.toString()
    }else{
        first
    }


}