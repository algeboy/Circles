import testPackage.


object test{




    main(args: Array[String]): Unit = {

        val cr1 = CircByRadius(1)
        val cr2 = CircByRadius(1)
        
        System.out.println( "Radius-Radius == comparison " + (cr1==cr2) 
                            + " vs. equals " + cr1.equals(cr2))
    }

}