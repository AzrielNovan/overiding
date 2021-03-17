/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

/**
 *
 * @author dell
 */
public class ShapeAttributes {
    float height, width, side, diameter, sum;

    public ShapeAttributes(){
        this.sum = 0;
    }

    public void Display(){
        System.out.println("No input found");
        System.out.println("sum : " + sum);
    }
}
