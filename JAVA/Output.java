package com.Calculator;
public class Output {

    //Object to call the class
    Operation op = new Operation();

    public void menu(){
        System.out.println("\t---        Welcome        ---");
        System.out.println("\t---    1. Addition    ---");
        System.out.println("\t---   2. Subtraction   ---");
        System.out.println("\t---  3. Multiplication   ---");
        System.out.println("\t---    4. Division    ---");
        System.out.println("\t---      5. EXIT      ---");
        System.out.print("Choose any option: ");
    }

    public void textAddition(){
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|            Addition            |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
        op.readData();
        op.Addition();
        System.out.println("\t|===>The answer is: " + op.add + " <===");
        System.out.println("\t ________________________________");
    }

    public void textSubtraction(){
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|         Subtraction            |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
        op.readData();
        op.Subtraction();
        System.out.println("\t|===>The answer is: " + op.sub + " <===");
        System.out.println("\t ________________________________");
    }

    public void textMultiplication(){
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|         Multiplication         |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
        op.readData();
        op.Multiplication();
        System.out.println("\t|===>The answer is: " + op.mul + " <===");
        System.out.println("\t ________________________________");
    }

    public void textDivision(){
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|            Division            |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
        op.readData();
        op.Division();
        System.out.println("\t|===>The answer is: " + op.div + " <===");
        System.out.println("\t ________________________________");
    }

    public void textBye(){
        System.out.println("\t ________________________________");
        System.out.println("\t|                                |");
        System.out.println("\t|    THX TO USE MY CALCULATOR    |");
        System.out.println("\t|                                |");
        System.out.println("\t ________________________________");
    }

}
