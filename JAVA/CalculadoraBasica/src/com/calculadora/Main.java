package com.calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Basic Calculator");

        //input
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter any whole number: ");
        int num1 = read.nextInt();

        System.out.print("Enter another whole number: ");
        int num2 = read.nextInt();

        //calculation
        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        //output
        System.out.println("\nTotals for the basic calculator");
        System.out.println("\nAddition for the numbers: " + num1 + " and " + num2 + " = " + add);
        System.out.println("Subtraction for the numbers: " + num1 + " and " + num2 + " = " + sub);
        System.out.println("Multiplication for the numbers: " + num1 + " and " + num2 + " = " + mul);
        System.out.println("Division for the numbers: " + num1 + " and " + num2 + " = " + div);

    }
}
