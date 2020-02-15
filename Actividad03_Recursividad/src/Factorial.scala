// 3.- Programa que muestre el FACTORIAL de un numero dado

import scala.io.StdIn._

object Factorial {
  def main(args: Array[String]): Unit = {
    println("Ingrese un numero:")
    var numero= readInt() 
    println("El factorial del numero "+numero+ " es " +factorial(numero))
  }//main
  
  def factorial(numero:Int) : Int = {
    if(numero == 0)
      1
    else
      factorial(numero-1)*numero
  }
}//object