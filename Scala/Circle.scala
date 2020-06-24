/**
  * I should probably change this package name but 
  * I need to think of one.
  */

package edu.colostate.mathematics.circles;

/**
 * Here we do not want sealed as we want other 
 * pages to access and edit them.
 **/

trait circle {
    def getRadius(): Double

    def getArea(): Double

    def getCircumference(): Double
}