// 7.- Programa que calcule a cantidad de vocales en una cadena
 
import scala.io.StdIn._

object Vocales {
  def main(args: Array[String]): Unit = {
    println("Ingrese una cadena ")
    var cadena= readLine()
    var cont=0
    var x=0
    var y=1
    var cantidad=0
    cadena=cadena.toLowerCase()
    println("Cantidad de vocales ")
    cantidadVocales(cadena,cont,x,y,cantidad)
    
  }//main
  def cantidadVocales(cadena:String,cont:Int,x:Int,y:Int,cantidad:Int):Unit={
    
    if(cont<=cadena.length()-1){
      if(cadena.substring(x,y).equals("a")||cadena.substring(x,y).equals("e")||cadena.substring(x,y).equals("i")||cadena.substring(x,y).equals("o")||cadena.substring(x,y).equals("u")){
        
        cantidadVocales(cadena,cont+1,x+1,y+1,cantidad+1)
      }else{        
        cantidadVocales(cadena,cont+1,x+1,y+1,cantidad)
      }
    }
    if(cont==cadena.length()){
       println(cantidad)
    }
   
  }
}//object