package edu.colostate.mathematics.circles;

public class TestEquality {

    public static void main(String[] args ) {
        // Create 4 circles, 2 by radius, 2 by area, compare.
        Circle cr1 = new CircByRadius(1);
        Circle cr2 = new CircByRadius(1);
        System.out.println( "Radius-Radius == comparison " + (cr1==cr2) 
                            + " vs. equals " + cr1.equals(cr2));

        Circle ca1 = new CircByArea(Math.PI);
        Circle ca2 = new CircByArea(Math.PI);
        System.out.println( "Area-Area comparison " + (ca1==ca2)
                            + " vs. equals " + ca1.equals(ca2));

        System.out.println( "Radius-Area comparison " + (cr1==ca1)
                            + " vs. equals " + cr1.equals(ca1));
        System.out.println( "Area-Radius comparison " + (ca1==cr1)
                            + " vs. equals " + ca1.equals(cr1));

    }
}