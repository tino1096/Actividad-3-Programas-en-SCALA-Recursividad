// 4.- Programa que muestre los cocientes enteros de la division entre entre dos números dados

import scala.io.StdIn._

object Cocientes {
  def main(args: Array[String]): Unit = {
    println("Ingrese el primer numero (numero mayor)")
    var  numero1 = readInt()
    println("Ingrese el segundo numero (numero menor)")
    var  numero2 = readInt()
    
    println("Los divisores del numero "+ numero1+" Son: ")
     divisores(numero1,numero2)
    
    
  }//main
   def divisores(numero1:Int, numero2:Int):Unit={
  //var div = new ListBuffer[Int]()//list
    if(numero2<=numero1){
      if(numero1%numero2==0 ){
     println(numero2)
     divisores(numero1,numero2+1)
    }else{
      divisores(numero1,numero2+1)
     }
    }
  }
  
}//object