package com.Calculator;
public class Main {
    public static void main(String[] args) {

        //Object to call the class ONLY call the class Output
        Output out = new Output();

        do {

            out.menu();

            switch (out.opt) {
                case 1 -> out.textAddition();
                case 2 -> out.textSubtraction();
                case 3 -> out.textMultiplication();
                case 4 -> out.textDivision();
                case 5 -> out.textBye();
                default -> out.tryAgain();
            }
        }while (out.opt != 5);
    }
}