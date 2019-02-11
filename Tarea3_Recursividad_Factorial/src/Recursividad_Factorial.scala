
import scala.io.StdIn._
object Recursividad_Factorial {
   
  def factorialDeUnNumero(numero:Int):Int = {
    
    if(numero == 0){ 1
      
    }else{factorialDeUnNumero(numero-1)*numero }
}
  def main(args: Array[String]): Unit = {
   println("INGRESA UN NUMERO:")
    val x=readInt() 
    println("EL FACTORIAL ES:"+factorialDeUnNumero(x))
  }
}