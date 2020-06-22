package edu.colostate.mathematics.circles;

public class CircByRadius extends Circle {

    private double rad;

    /**
     * Constructor (introduction) for a circle given by a radius, 
     * akin to r:Double |- byRad(r):Circle
     * @param rad the radius of the circle, must be nonnegative.
     * @throws IllegalArgumentException if given a negative number.
     */
    CircByRadius( double rad ) throws IllegalArgumentException {
        if (rad < 0)
            throw new IllegalArgumentException( "Radius should be positive, given " + rad + "." );
        else 
            this.rad = rad;
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
        return rad;
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
        return Math.PI * rad;
    }

    @Override
    public boolean equals( Object o ) {
        if ( o instanceof Circle ) {
            Circle that = (Circle) o;
            // technical issue, off by small decimals, 
            // so convert to half the precession and compare there.
            return (float) this.rad == (float) that.getRadius();
        } else {
            return false;
        }
    }

    
}