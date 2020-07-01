import testPackage._

object test{
    def main(args: Array[String]): Unit = {
    val cr1 = new CircByRadius(1.0)
    val cr2 = CircByRadius(1.0)
        
    println( "Radius-Radius == comparison " + (cr1==cr2) 
                            + " vs. equals " + cr1.equals(cr2))
    


  }


}