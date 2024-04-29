package com.introJava;

public class Main {
    public static void main(String[] args) {
        //Comentario de una linea

        /*
         * Comentario
         * de
         * Varias
         * Lineas
         */

        System.out.print("Hola Mundo, soy un Texto sin salto de linea en JAVA");
        System.out.println("\t\t\t\tHola Mundo, soy un Texto con salto de linea y Tabulacion en JAVA"); // \t es para hacer una tabulacion

        //Variables int
        System.out.print("\nVariables numericas con Int\n");// \n es para hacer un salto de linea

        int num = 100, num1 = 100, sum, res, mul, div;
        sum = num + num1;
        res = num - num1;
        mul = num * num1;
        div = num / num1;

        System.out.println("Concatenar variables: " + num + " + " + num1 + " = " + num + num1);
        System.out.println("La sumatoria de: " + num + " + " + num1 + " = " + sum);
        System.out.println("La resta de: " + num + " - " + num1 + " = " + res);
        System.out.println("La multiplicacion de: " + num + " * " + num1 + " = " + mul);
        System.out.println("La division de: " + num + " / " + num1 + " = " + div);

        //Variables Double
        System.out.print("\nVariables numericas con Double\n");// \n es para hacer un salto de linea

        double numDouble = 101.55, num1Double = 100.55, sumDouble, resDouble, mulDouble, divDouble; //Double almacena 64 Bits
        sumDouble = numDouble + num1Double;
        resDouble = numDouble - num1Double;
        mulDouble = numDouble * num1Double;
        divDouble = numDouble / num1Double;

        System.out.println("Concatenar variables: " + numDouble + " + " + num1Double + " = " + numDouble + num1Double);
        System.out.println("La sumatoria de: " + numDouble + " + " + num1Double + " = " + sumDouble);
        System.out.println("La resta de: " + numDouble + " - " + num1Double + " = " + resDouble);
        System.out.println("La multiplicacion de: " + numDouble + " * " + num1Double + " = " + mulDouble);
        System.out.println("La division de: " + numDouble + " / " + num1Double + " = " + divDouble);

        //Variables Float
        System.out.print("\nVariables numericas con Float\n");// \n es para hacer un salto de linea

        float numFloat = 101.55f, num1Float = 100.55f, sumFloat, resFloat, mulFloat, divFloat; //Float almacena 32 Bits
        sumFloat = numFloat + num1Float;
        resFloat = numFloat - num1Float;
        mulFloat = numFloat * num1Float;
        divFloat = numFloat / num1Float;

        System.out.println("Concatenar variables: " + numFloat + " + " + num1Float + " = " + numFloat + num1Float);
        System.out.println("La sumatoria de: " + numFloat + " + " + num1Float + " = " + sumFloat);
        System.out.println("La resta de: " + numFloat + " - " + num1Float + " = " + resFloat);
        System.out.println("La multiplicacion de: " + numFloat + " * " + num1Float + " = " + mulFloat);
        System.out.println("La division de: " + numFloat + " / " + num1Float + " = " + divFloat);


        //Variables con char
        System.out.print("\nVariables de texto con Char\n");

        char inicialNombre = 'S';

        System.out.println("La inicial de mi nombre es: " + inicialNombre);

        //Variable con String
        System.out.print("\nVariables de texto con String\n");

        String nombre = "Stevens";

        System.out.println("El nombre de la inicial: " + inicialNombre + " es: " + nombre);

        //Variables mutables, inmutables y constantes
        System.out.print("\nVariables mutables, inmutables y constantes\n");

        int x = 5; // variable entera mutable
        String nombre1 = "Edwin"; // variable de tipo String mutable

        final int y = 10; // variable entera inmutable
        final String apellido = "Cambranes"; // variable de tipo String inmutable

        final double PI = 3.14159; // constante de tipo double
        final String SALUDO = "Hola"; // constante de tipo String

        System.out.println("Las variables que pueden cambiar o mutar en cualquier momento son: " + x + " y " + nombre1);
        System.out.println("Las variables cuyo valor no puede cambiar después de haber sido asignadas por primera vez son: " + y + " y " + apellido);
        System.out.println("Las variables cuyo valor no puede cambiar en absoluto durante la ejecución del programa son: " + PI + " y " + SALUDO);

        //Lists, Sets, Maps triple S

    }
}