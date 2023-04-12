package com.example.kotlinbasics
fun main() {
    println(findWord(arrayOf("P>E","E>R","R>U"))) // PERU
    println(findWord(arrayOf("I>N","A>I","P>A","S>P"))) // SPAIN
    println(findWord(arrayOf("U>N", "G>A", "R>Y", "H>U", "N>G", "A>R"))) // HUNGARY
    println(findWord(arrayOf("R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G"))) // PORTUGAL
    println(findWord(arrayOf("W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T"))) // SWITZERLAND
    println(findWord(arrayOf("I>S", "C>R", "R>I"))) // CRIS
    println(findWord(arrayOf("I>S", "L>U", "U>I"))) // LUIS
}



fun findWord(rules: Array<String>): String {
    // Create a map to store the letter-to-letter mapping
    val mapping = mutableMapOf<Char, Char>()
    for (rule in rules) {
        mapping[rule[0]] = rule[2] // set the value of the key-value pair to the third character in the precedence rule string
    }

    // Find the first letter in the word
    var firstLetter: Char? = null
    for (letter in mapping.keys) {
        if (letter !in mapping.values) { // if the letter is not a value in the map, it is the first letter of the word
            firstLetter = letter
            break
        }
    }

    // Build the word from the mapping
    var word = ""
    var nextLetter = firstLetter
    while (nextLetter != null) {
        word += nextLetter // add the current letter to the word
        nextLetter = mapping[nextLetter] // set the next letter to the value corresponding to the current letter in the mapping
    }

    return word
}