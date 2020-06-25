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
}