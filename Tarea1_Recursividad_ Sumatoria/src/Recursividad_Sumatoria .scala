import scala.io.StdIn._

object Recursividad_Sumatoria  {
  
  def sumatoria(limiteLnicial:Int, limiteFinal:Int): Int = {
    
    if(limiteLnicial < limiteFinal )
      sumatoria(limiteLnicial+1, limiteFinal)+limiteLnicial
      
    else  limiteFinal
}
  
  def main(args: Array[String]): Unit = {
    println("INGRESA EL LIMITE INICIAL DE LA SUMATORIA:")
    val x=readInt()
    println("INGRESA EL LIMITE FINAL DE LA SUMATORIA:")
    val y=readInt()
     println("LA SUMATORIA ES IGUAL: "+ sumatoria(x,y))
  }
}