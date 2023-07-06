import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //variables
        int opc, num1, num2;

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
        //Read variable opc
        Scanner read = new Scanner (System.in); opc = read.nextInt();

        switch (opc) {

            case 1 -> {
                System.out.println(" ---------------------------------------------- ");
                System.out.println("|                  ADDITION                    |");
                System.out.println(" ---------------------------------------------- ");
                System.out.println("Enter the 1st number: ");
                num1 = read.nextInt();
                System.out.println("Enter the 2nd number: ");
                num2 = read.nextInt();
                int sum = num1 + num2;
                System.out.println("The total is: " + sum);
            }

            case 2 -> {
                System.out.println(" ---------------------------------------------- ");
                System.out.println("|                  SUBTRACTION                 |");
                System.out.println(" ---------------------------------------------- ");
                System.out.println("Enter the 1st number: ");
                num1 = read.nextInt();
                System.out.println("Enter the 2nd number: ");
                num2 = read.nextInt();
                int sub = num1 - num2;
                System.out.println("The total is: " + sub);
            }

            case 3 -> {
                System.out.println(" ---------------------------------------------- ");
                System.out.println("|             MULTIPLICATION                   |");
                System.out.println(" ---------------------------------------------- ");
                System.out.println("Enter the 1st number: ");
                num1 = read.nextInt();
                System.out.println("Enter the 2nd number: ");
                num2 = read.nextInt();
                int mul = num1 * num2;
                System.out.println("The total is: " + mul);
            }

            case 4 -> {
                System.out.println(" ---------------------------------------------- ");
                System.out.println("|                 DIVISION                     |");
                System.out.println(" ---------------------------------------------- ");
                System.out.println("Enter the 1st number: ");
                num1 = read.nextInt();
                System.out.println("Enter the 2nd number: ");
                num2 = read.nextInt();
                int div = num1 / num2;
                System.out.println("The total is: " + div);
            }

            case 5 -> {
                System.out.println(" ---------------------------------------------- ");
                System.out.println("|        thx for use this calculator ;)        |");
                System.out.println(" ---------------------------------------------- ");
            }
            default -> System.out.println("wrong choice :( try again: ");
        }

    }
    
}