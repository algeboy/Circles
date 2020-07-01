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

/**
 * Constructor (introduction) for a circle given by a radius.
 * @param rad is the radius of the circle. I need to make it non-negative.
 */

class CircByRadius(rad:Double) extends Option[Circle]{



if (rad < 0)  None

else{
/**
* @return the radius of a circle.
*/ 
    
    def getRadius()={
        rad
    }
    
/**
* @return the area of a circle.
*/

    def getArea() ={
        rad * rad * Math.PI
    }

    /**
    * @return the circumference of a circle.
    */

    def getCircumference()={
        2*rad *Math.PI
    }




    def equals(o:Circle)={
        if (o.getRadius() == rad) true
        else false
    }
}
    
}
/**
 * Constructor (introduction) for a circle given by an area. 
 * @param area is the area of a circle. It needs to be non negative.
 */

class CircByArea(area:Double) extends Option[Circle]{

if (area < 0) None
else{
/**
 * @return the radius of a circle.
 */

  def getRadius()={
        Math.sqrt(area/Math.PI)
    }

    /**
    * @return the area of a circle.
    */

    def getArea() ={
            area
        }

    /**
    * @return the circumference of a circle.
    */
        def getCircumference()={
        Math.sqrt(area/Math.PI) * 2 * Math.PI
        }


        def equals(o:Circle)={
            if (o.getArea() == area) true
            else false
        }
    }
}
    /**
     * Constructor (introduction) for a circle given by a circumference.
     * @param cir is the circumference of a circle. It needs to be nonnegative.
     */
class CircByCircumference(cir:Double) extends Option[Circle]{
/**
 * @return the radius of a circle.
 */
if (cir < 0) None
else {
    def getRadius() = {
    cir / (2 * Math.PI)
    }
    /**
    * @return the area of a circle.
    */
    def getArea()={
    Math.pow( cir / (2 * Math.PI),2) * 2 * Math.PI
    }

    /**
    * @return the circumference of a circle.
    */

    def getCircumference()={
        cir
        }

        def equals(o:Circle)={
            if (o.getCircumference() == cir) true
            else false
        }
    }
}

object test{



  

    val cr1 = testPackage.CircByRadius(1.0)
    val cr2 = CircByRadius(1.0)
        
    println( "Radius-Radius == comparison " + (cr1==cr2) 
                            + " vs. equals " + cr1.equals(cr2))
    

}

}