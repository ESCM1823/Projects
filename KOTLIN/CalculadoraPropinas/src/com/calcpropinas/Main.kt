package com.calcpropinas

import java.util.Scanner

fun main(){
    println("Tips calculator")

    // user input
    val read = Scanner(System.`in`)

    print("\nEnter name of employee: ")
    val nameEmployee = read.nextLine()

    print("Enter total tips: ")
    val tips = read.nextFloat()

    print("Enter percent (decimals) that you want to add to tips: ")
    val percent = read.nextFloat()

    //calculation
    val totalTips = tips * percent

    //output
    println("\nEmployee: $nameEmployee")
    println("Tips: $tips")
    println("Tips percent: ${percent * 100} %")
    println("Total tips for the employee: $nameEmployee with percent of $percent is: $ $totalTips")
}
