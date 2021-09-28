package com.dev.cslaunchpadtestapp

/**
 * Copyright (c) 2021 Eniola Ipoola
 * All rights reserved
 * Created on 16-Sep-2021
 */
class DataType {

    fun main(){
        var q = 10  // a double
        val s = 10     //an integer
        val name = "oreOfe" // a string
        q = 5

        val result = q * s
        println(result)


        println("Hello, world!!!")
        val addition = performAddition(q, s)
        println(addition)

    }

    // String
    // Integer
    // Double
    // boolean

    val name = "My name is Eniola"

    val a = 9
    val b = 10

    val result = a * b

    //this variable will neve change
    var x = 10  //this variable can be updated to anything

    //performAddition()


    //this is a method
    fun performAddition(a: Int, b: Int) : Int {
        //to add both numbers together, we will have
        val addition = a + b
        return addition
    }


}