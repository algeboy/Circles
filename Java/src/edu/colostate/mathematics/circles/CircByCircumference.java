package edu.colostate.mathematics.circles;


public class CircByCircumference extends Circle {

    private double circumference ;


    /**
     * Constructor (introduction) for a circle given by a area, 
     * akin to a:Double |- byArea(a):Circle
     * @param circumference the circumference  of the circle, must be nonnegative.
     * @throws IllegalArgumentException if given a negative number.
     */
    CircByCircumference( double circumference ) throws IllegalArgumentException {
        if (circumference < 0)
            throw new IllegalArgumentException( "Circumference should be positive, given " + circumference + "." );
        else 
            this.circumference = circumference;
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
        return ( circumference /(2 * Math.PI) );
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
        return Math.pow(( circumference /(2 * Math.PI) ),2)* Math.PI;
    }

    /**
     * This serves as the eliminator for circles treated as having area.
     * Again we are required to define it to become a concrete class as
     * this is required in our interface `Circle`.  Unlike #getRadius()
     * here we have to modify the return appropriately.
     * 
     * @return the circumference of the circle.
     */
    @Override
    public double getCircumference() {
        return circumference;
    }

    @Override
    public boolean equals( Object o ) {
        if ( o instanceof Circle ) {
            Circle that = (Circle) o;
            // technical issue, off by small decimals, 
            // so convert to half the precession and compare there.
            return (float) this.circumference == (float) that.getCircumference();
        } else {
            return false;
        }
    }



}