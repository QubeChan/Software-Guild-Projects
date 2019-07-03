/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesandperimeters;

/**
 *
 * @author Qube
 */
public abstract class Shape {

    protected String color;
    protected double area,
            perimeter;

    public abstract double getArea();

    public abstract double getPerimeter();

}
