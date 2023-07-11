package com.example.kotlinbasics

//word = "as?b?e?gf"

//substr = "dbk"

//output = "asdbkeagf"]

fun main() {
    println(replaceQuestionMarks("as?b?e?gf", "dbk"))
}


// helper function to replace question marks with substr
fun replaceQuestionMarks(word: String, substr: String): String {
// check if substr is longer than word or word does not contain any question marks
    if (substr.length > word.length || !word.contains("?")) return "-1"

// convert word to char array for easy manipulation
    val chars = word.toCharArray()

// loop through the chars and replace question marks with substr
    var i = 0
    while (i < chars.size) {
        if (chars[i] == '?') {
// check if there is enough space to insert substr
            if (i + substr.length > chars.size) return "-1"

// check if the substr overlaps with the existing characters
            var overlap = false
            for (j in 0 until substr.length) {
                if (chars[i + j] != '?' && chars[i + j] != substr[j]) {
                    overlap = true
                    break
                }
            }

// if there is no overlap, copy the substr chars to the position
            if (!overlap) {
                for (j in 0 until substr.length) {
                    chars[i + j] = substr[j]
                }
            }

// update the index to skip the inserted substr or the question mark
            i += if (overlap) 1 else substr.length
        } else {
// increment the index by one
            i++
        }
    }

// replace any remaining question marks with 'a'
    for (k in chars.indices) {
        if (chars[k] == '?') chars[k] = 'a'
    }

// return the new word as a string
    return String(chars)
}



