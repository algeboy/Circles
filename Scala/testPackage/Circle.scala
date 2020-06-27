/**
  * I should probably change this package name but 
  * I need to think of one.
  */
package testPackage{


/**
 * Here we do not want sealed as we want other 
 * pages to access and edit them.
 **/

trait Circle {
    def getRadius(): Double

    def getArea(): Double

    def getCircumference(): Double

}



class CircByRadius(rad:Double) extends Circle{
    
    def getRadius()={
        rad
    }
    

    def getArea() ={
        rad * rad * Math.PI
    }


    def getCircumference()={
        2*rad *Math.PI
    }




    def equals(o:Circle)={
        if (o.getRadius() == rad) true
        else false
    }
}



class CircByArea(area:Double) extends Circle{

  def getRadius()={
        Math.sqrt(area/Math.PI)
    }

  def getArea() ={
        area
    }


    def getCircumference()={
       Math.sqrt(area/Math.PI) * 2 * Math.PI
    }
    
    def equals(o:Circle)={
        if (o.getArea() == area) true
        else false
    }

}

class CircByCircumference(cir:Double) extends Circle{

def getRadius() = {
  cir / (2 * Math.PI)
}

def getArea()={
  Math.pow( cir / (2 * Math.PI),2) * 2 * Math.PI
}

def getCircumference()={
       cir
    }

    def equals(o:Circle)={
        if (o.getCircumference() == cir) true
        else false
    }
}

object test{

    import testPackage.


  

    val cr1 = CircByRadius(1.0)
    val cr2 = CircByRadius(1.0)
        
    println( "Radius-Radius == comparison " + (cr1==cr2) 
                            + " vs. equals " + cr1.equals(cr2))
    

}

}