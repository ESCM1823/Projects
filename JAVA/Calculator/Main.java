package com.Calculator;
import java.util.Scanner;
//ONLY call the class Output
public class Main {
    public static void main(String[] args) {
        //local variables

        //Object to call the class
        Output out = new Output();

        //read the data
        Scanner read = new Scanner(System.in);
        out.menu();
        int opc = read.nextInt();

        switch (opc) {
            case 1 -> out.textAddition();
            case 2 -> out.textSubtraction();
            case 3 -> out.textMultiplication();
            case 4 -> out.textDivision();
            case 5 -> out.textBye();
            default -> System.out.println("Try again");
        }
    }
}