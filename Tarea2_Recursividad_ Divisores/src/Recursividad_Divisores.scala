import scala.io.StdIn._

object Recursividad_Divisores {
   def divisoresDeUnNumero(numDivisores:Int, numero:Int) {

     if(numDivisores <= numero){
      
       if((numero%numDivisores) == 0){
          print(numDivisores+",")}
       
       divisoresDeUnNumero(numDivisores+1, numero)
    }
}
   
  def main(args: Array[String]): Unit = {
      val inicio=1
   println("INGRESA UN NUMERO:")
  
    val x=readInt() 
     print("LOS DIVISORES SON:")
     divisoresDeUnNumero(inicio,x) 
  
  }
}