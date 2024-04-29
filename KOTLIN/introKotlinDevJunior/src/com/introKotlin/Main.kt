package com.introKotlin

fun main(){
    //Comentario de una linea

    /*
    * Comentario
    * de
    * Varias
    * Lineas
    */
    print("Hola Mundo, soy un Texto sin salto de linea en KOTLIN")
    println("\t\t\t\tHola Mundo, soy un Texto con salto de linea en KOTLIN")

    //Variables int
    println("\nVariables tipo Int")
    var num:Int = 100//especificando la variable
    var num1 = 100//sin especificar la variable

    var sum:Int = num + num1
    var res:Int = num - num1
    var mul:Int = num * num1
    var div:Int = num / num1

    println("Concatenar variables: $num + $num1 = $num$num1")
    println("La sumatoria de: $num + $num1 = $sum")
    println("La resta de: $num - $num1 = $res")
    println("La multiplicacion de: $num * $num1 = $mul")
    println("La division de: $num / $num1 = $div")

    //Variables Double
    println("\nVariables tipo Double")
    var numDouble:Double = 101.55
    var num1Double:Double = 100.55

    var sumDouble:Double = numDouble + num1Double
    var resDouble:Double = numDouble - num1Double
    var mulDouble:Double = numDouble * num1Double
    var divDouble:Double = numDouble / num1Double

    println("Concatenar variables: $numDouble + $num1Double = $numDouble$num1Double")
    println("La sumatoria de: $numDouble + $num1Double = $sumDouble")
    println("La resta de: $numDouble - $num1Double = $sumDouble")
    println("La multiplicacion de: $numDouble * $num1Double = $sumDouble")
    println("La division de: $numDouble / $num1Double = $sumDouble")

    //Variables Float
    println("\nVariables tipo Float")
    var numFloat:Float = 101.55f
    var num1Float:Float = 100.55f

    var sumFloat:Float = numFloat + num1Float
    var resFloat:Float = numFloat - num1Float
    var mulFloat:Float = numFloat * num1Float
    var divFloat:Float = numFloat / num1Float

    println("Concatenar variables: $numFloat + $num1Float = $numFloat$num1Float")
    println("La sumatoria de: $numFloat + $num1Float = $sumFloat")
    println("La resta de: $numFloat - $num1Float = $sumFloat")
    println("La multiplicacion de: $numFloat * $num1Float = $sumFloat")
    println("La division de: $numFloat / $num1Float = $sumFloat")

    //Variables char
    println("\nVariables tipo Char")

    var inicialNombre:Char = 'S'

    println("La inicial de mi nombre es: $inicialNombre")

    //Variables String
    println("\nVariables tipo String")

    var nombre:String = "Stevens"

    println("El nombre de la inicial: $inicialNombre es: $nombre")

    //Variables mutables e inmutables
    println("\nVariables mutables e inmutables")
    val popcorn = 5 //Only 5 popcorn
    val hotdog = 7//Only 7 Hotdogs
    var pizzaCustomers = 10

    // Some customers leave the queue
    pizzaCustomers = 8
    println("There are $pizzaCustomers customers") // There are 8 customers

    println("There are ${pizzaCustomers + 2} customers") // There are 10 customers
    pizzaCustomers += 3
    pizzaCustomers += 7// Example of addition
    pizzaCustomers -= 3// Example of subtraction
    pizzaCustomers *= 2// Example of multiplication
    pizzaCustomers /= 3// Example of division

    //Lists, Sets, Maps triple S

}