package com.example.androidseekho

class Dice(val valSides : Int) {
    //var sides = 6

    fun roll() : Int {
        val randomNumber = (1..valSides).random()
        println(randomNumber)
        return randomNumber
    }
}