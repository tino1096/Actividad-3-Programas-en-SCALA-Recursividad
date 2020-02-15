// 2.- Programa que muestre los DIVISORES de un numero dado

import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object Divisores {
  def main(args: Array[String]): Unit = {
     println("Ingrese un numero entero")
     var numero= readInt()
     var divisor = 1
    
     println("Los divisores del numero "+ numero+" Son: ")
     divisores(numero,divisor)
     
  }//main
  
  def divisores(numero:Int, divisor:Int):Unit={
  //var div = new ListBuffer[Int]()//list
    if(divisor<=numero){
      if(numero%divisor==0 ){
     println(divisor)
     divisores(numero,divisor+1)
    }else{
      divisores(numero,divisor+1)
    }
    }
  }
}//object