import scala.io.StdIn._

object Recursividad_DivisoresDosNumeros {
  
def totalDeDivisores(Num1:Int, Num2:Int,totalDivisores:Int):Int ={
  
    if(Num1 <= Num2){
       if((Num2%Num1) == 0)
          totalDeDivisores(Num1+1, Num2,totalDivisores+1)
          
       else totalDeDivisores(Num1+1, Num2,totalDivisores)
    }else{
      
       totalDivisores
    }
}
  def main(args: Array[String]): Unit = {
 val divisor=1
    println("INGRESA EL PRIMER NUMERO DE LA DIVISION:")
    val x=readInt()
    println("INGRESA EL SEGUNDO NUMERO DE LA DIVISION:")
    val y=readInt()
    println("LOS DIVISORES ENTRE ESTOS 2 NUMERO SON: "+totalDeDivisores(x, y, divisor))
  }
}