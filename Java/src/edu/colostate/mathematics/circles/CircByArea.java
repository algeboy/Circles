package edu.colostate.mathematics.circles;

public class CircByArea extends Circle {

    private double area;

    /**
     * Constructor (introduction) for a circle given by a area, 
     * akin to a:Double |- byArea(a):Circle
     * @param area the area of the circle, must be nonnegative.
     * @throws IllegalArgumentException if given a negative number.
     */
    CircByArea( double area ) throws IllegalArgumentException {
        if (area < 0)
            throw new IllegalArgumentException( "Radius should be positive, given " + area + "." );
        else 
            this.area = area;
    }

    /**
     * As we made the internal state `rad` private this function
     * serves as an eliminator.  We are required to define it to 
     * become a concrete (rather than abstract) class.  This is
     * because we implement `Circle` which has this function required.
     * 
     * @return the radius of the circle.
     */
    @Override
    public double getRadius() {
        return Math.sqrt( area / Math.PI );
    }

    /**
     * This serves as the eliminator for circles treated as having area.
     * Again we are required to define it to become a concrete class as
     * this is required in our interface `Circle`.  Unlike #getRadius()
     * here we have to modify the return appropriately.
     * 
     * @return the area of the circle.
     */
    @Override
    public double getArea() {
        return area;
    }

    @Override
    public boolean equals( Object o ) {
        if ( o instanceof Circle ) {
            Circle that = (Circle) o;
            return this.area == that.getArea();
        } else {
            return false;
        }
    }

    
}