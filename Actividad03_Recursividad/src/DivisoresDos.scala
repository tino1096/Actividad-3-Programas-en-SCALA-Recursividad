// 5.- Programa que muestre cuantos son los divisores enteros entre dos números dados

import scala.io.StdIn._

object DivisoresDos {
  
def main(args: Array[String]): Unit = {
    println("Ingrese el primer numero (numero mayor)")
    var  numero1 = readInt()
    println("Ingrese el segundo numero (numero menor)")
    var  numero2 = readInt()
     var cont=1
    println("el total de divisores del numero "+ numero1+" es: " )
    divisores(numero1,numero2,cont)
    
    
  }//main
   def divisores(numero1:Int, numero2:Int,cont:Int):Unit={
  
    if(numero2<=numero1){
      if(numero1%numero2==0 ){
         
     divisores(numero1,numero2+1,cont+1)
    }else{
      divisores(numero1,numero2+1,cont)
    }
    }
    if(numero2==numero1){
      println(cont)
    }
    
  }
  
}//object