package com.example.amolabs.lab3.interpolation



fun factorial(num:Int):Int{
    var res = 1
    for(i in 1..num){
        res *= i
    }
    return res
}