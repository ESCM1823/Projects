import java.util.Scanner;

public class Main {
    private static void Menu(){

        System.out.println("\t ---------------------------------------------- \t");
        System.out.println("\t|           Menu for basic Calculator          |\t");
        System.out.println("\t|----------------------------------------------|\t");
        System.out.println("\t|                1. ADDITION                   |\t");
        System.out.println("\t|               2. SUBTRACTION                 |\t");
        System.out.println("\t|             3. MULTIPLICATION                |\t");
        System.out.println("\t|                 4. DIVISION                  |\t");
        System.out.println("\t|                  5. EXIT                     |\t");
        System.out.println("\t|______________________________________________|\t");
        System.out.println("Choose any option you want: ");
    }

    private static void addition(){
        //Read keyboard
        Scanner read = new Scanner (System.in);

        System.out.println(" ---------------------------------------------- ");
        System.out.println("|                  ADDITION                    |");
        System.out.println(" ---------------------------------------------- ");
        System.out.println("Enter the 1st number: ");
        int num1 = read.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = read.nextInt();
        int sum = num1 + num2;
        System.out.println("The total is: " + sum);
    }

    private static void subtraction(){
        //Read keyboard
        Scanner read = new Scanner (System.in);

        System.out.println(" ---------------------------------------------- ");
        System.out.println("|                  SUBTRACTION                 |");
        System.out.println(" ---------------------------------------------- ");
        System.out.println("Enter the 1st number: ");
        int num1 = read.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = read.nextInt();
        int sub = num1 - num2;
        System.out.println("The total is: " + sub);
    }

    private static void multiplication(){
        //Read keyboard
        Scanner read = new Scanner (System.in);

        System.out.println(" ---------------------------------------------- ");
        System.out.println("|             MULTIPLICATION                   |");
        System.out.println(" ---------------------------------------------- ");
        System.out.println("Enter the 1st number: ");
        int num1 = read.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = read.nextInt();
        int mul = num1 * num2;
        System.out.println("The total is: " + mul);
    }

    private static void division(){
        //Read keyboard
        Scanner read = new Scanner (System.in);

        System.out.println(" ---------------------------------------------- ");
        System.out.println("|                 DIVISION                     |");
        System.out.println(" ---------------------------------------------- ");
        System.out.println("Enter the 1st number: ");
        int num1 = read.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = read.nextInt();
        int div = num1 / num2;
        System.out.println("The total is: " + div);
    }

    public static void main(String[] args) {

        //variables
        int opc;
        boolean exit = false;

        //Call the function Menu
        Menu();

        //Read keyboard
        Scanner read = new Scanner (System.in);

        //make the opc variable read the input data
        opc = read.nextInt();

        while (!exit) {
            switch (opc) {
                case 1 -> addition();

                case 2 -> subtraction();

                case 3 -> multiplication();

                case 4 -> division();

                case 5 -> {
                    exit = true;
                    System.out.println(" ---------------------------------------------- ");
                    System.out.println("|        thx for use this calculator ;)        |");
                    System.out.println(" ---------------------------------------------- ");
                }

                default -> System.out.println("wrong choice :( try again: ");
            }
        }
    }
}