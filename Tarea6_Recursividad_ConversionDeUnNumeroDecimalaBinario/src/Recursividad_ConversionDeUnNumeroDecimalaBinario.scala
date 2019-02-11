import scala.io.StdIn._

object Recursividad_ConversionDeUnNumeroDecimalaBinario {
  
  def DecimalBinario(numeroDecimal:Int,resBinario:String):String = {
    if(numeroDecimal == 0){
      resBinario
      
    }else
      DecimalBinario(numeroDecimal/2,  (numeroDecimal%2).toString() + resBinario)
}
  def main(args: Array[String]): Unit = {
    println("INGRESA EL NUMERO DECIMAL A CONVERTIR:")
    val x=readInt() 
    println("EL NUMERO ES IGUAL A:"+DecimalBinario(x, ""))
  }
}