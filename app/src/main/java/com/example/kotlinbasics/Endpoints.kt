package com.example.kotlinbasics

// valid: http://foo.bar/‹version>/‹endpoint>
// default endpoint: default
// default version: v1

// Samples: http://foo.bar -> http://foo.bar/v1/default
// http://foo.bar/ve/b@adPoint -> http://foo.bar/v1/default
// http://foof.bar/v1/goodpoint -> http://foo.bar/v1/goodpoint
// http://foo.bar/endpoint/v3 -> http://foo.bar/v3/endpoint
// http://foo.bar/vA/anotherpoint http://foo.bar/v1/anotherpoint | http://foo.bar/v1/vA
// http://foo.bar/noversion -> http://foo.bar/v1/noversion
// http://foos.bar/v6.2 -> http://foo.bar/v1/default
// http://foo.bar/v2 -> http://foo.bar/v2/default
// http://food.bar/vAT/1234 -> http://foo.bar/v1/VAT | http://foo.bar/v1/default
// http://foo.bar/2/badversion -> http://foo.bar/v1/badversion


fun main() {


   val a = convertUrl("http://foo.bar/ve/b@adPoint")

    println(a)


}

fun convertUrl(url: String): String {
    val urlParts = url.split("/")
    //print(urlParts[3])
    var version = "v1"
    var endpoint = "default"

    if (urlParts.size > 1) {
        val possibleVersion = urlParts[3].replace("v", "")

        if (possibleVersion.toDoubleOrNull() != null) {
            version = "v${possibleVersion}"
            if (urlParts.size > 2) {
                endpoint = urlParts[4].replace(urlParts[4], endpoint)
            }
        } else {
            endpoint = urlParts[4].replace(urlParts[4], endpoint)
        }
    }

    return "http://foo.bar/${version}/${endpoint}"
}