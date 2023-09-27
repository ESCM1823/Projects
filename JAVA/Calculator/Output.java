package com.Calculator;
import java.util.Scanner;
public class Output {

    //Object to call the class ONLY call the class Operation
    Operation op = new Operation();

    //local variables
    int opt;

    public void menu(){
        System.out.println("\n");
        System.out.println("\t---        Welcome        ---");
        System.out.println("\t---    1. Addition    ---");
        System.out.println("\t---   2. Subtraction   ---");
        System.out.println("\t---  3. Multiplication   ---");
        System.out.println("\t---    4. Division    ---");
        System.out.println("\t---      5. EXIT      ---");
        System.out.print("Choose any option: ");
        //read the data
        Scanner read = new Scanner(System.in);
        opt = read.nextInt();
        System.out.println("\n");
    }

    public void textAddition(){
        System.out.println("\n");
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|            Addition            |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
        op.readData();
        op.Addition();
        System.out.println("\t|===>The answer is: " + op.add + " <===");
        System.out.println("\t ________________________________");
        System.out.println("\n");
    }

    public void textSubtraction(){
        System.out.println("\n");
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|         Subtraction            |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
        op.readData();
        op.Subtraction();
        System.out.println("\t|===>The answer is: " + op.sub + " <===");
        System.out.println("\t ________________________________");
        System.out.println("\n");
    }

    public void textMultiplication(){
        System.out.println("\n");
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|         Multiplication         |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
        op.readData();
        op.Multiplication();
        System.out.println("\t|===>The answer is: " + op.mul + " <===");
        System.out.println("\t ________________________________");
        System.out.println("\n");
    }

    public void textDivision(){
        System.out.println("\n");
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|            Division            |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
        op.readData();
        op.Division();
        System.out.println("\t|===>The answer is: " + op.div + " <===");
        System.out.println("\t ________________________________");
        System.out.println("\n");
    }

    public void textBye(){
        System.out.println("\n");
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|    THX TO USE MY CALCULATOR    |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
        System.out.println("\n");
        System.exit(0); // Salir del programa
    }

    public void tryAgain(){
        System.out.println("\n");
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|            Try Again           |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
        System.out.println("\n");
        menu();
    }
}
