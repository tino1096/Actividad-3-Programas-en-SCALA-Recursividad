
/* 1.- Programa que mueste la sumatoria de numeros enteros 
       desde un limite inicial hasta un limite final.
*/

import scala.io.StdIn._

object Sumatoria {
  def main(args: Array[String]): Unit = {
    println("Ingresa el primer numero entero: ")
    var numero1 = readInt()
    println("Ingresa el segundo numero entero: ")
    var numero2 = readInt()
    
    println("Sumatoria de "+ numero1 +" hasta "+ numero2+" = "+sumaRecursiva(numero1, numero2))
  
  }//main
  

def sumaRecursiva(a: Int, b: Int): Int = {
    if (a > b) 0
    else {
        a + sumaRecursiva(a+1, b)
    }
}//suma recursiva

  }
