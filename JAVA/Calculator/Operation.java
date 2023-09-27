package com.Calculator;
import java.util.Scanner;
public class Operation {
    //local variables
    int add, sub, mul, num1, num2;
    double div;

    //method read the numbers
    public void readData(){
        Scanner read = new Scanner(System.in);
        System.out.print("\t|Enter the 1st number: ");
        num1 = read.nextInt();
        System.out.print("\n\t|Enter the 2nd number: ");
        num2 = read.nextInt();
    }

    //method addition
    public void Addition(){
        add = num1 + num2;
    }

    //method subtraction
    public void Subtraction(){
        sub = num1 - num2;
    }

    //method multiplication
    public void Multiplication(){
        mul = num1 * num2;
    }

    //method division
    public void Division(){
        div = (double) num1 / num2;
    }

}