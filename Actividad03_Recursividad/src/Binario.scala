// 6.- Programa que muestre la conversión de un numero decimal 
//     a su representación en sistema binario.

import scala.io.StdIn._

object Binario {
  def main(args: Array[String]): Unit = {
    println("Ingrese un numero entero")
    var num = readInt()
    println("El numero decimal es "+ num)
    println("El numero binario es ")
     binario(num)
    
  }//main
  
  def binario(num:Int):Unit={
    var numBin=""
    if(num>=1){
      if(num%2==0 ){
    // print(0)
        numBin+="0"
     binario(num/2)
    }else{
      //print(1)
      numBin+="1"
      binario(num/2)
    }
    }
    print(numBin)
  }
}//object