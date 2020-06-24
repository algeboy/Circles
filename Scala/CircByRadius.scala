package edu.colostate.mathematics.circles;

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