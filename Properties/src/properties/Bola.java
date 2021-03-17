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
public class Bola extends ShapeAttributes{

    public Bola (float Diameter){
        this.diameter = Diameter;
    }

    public float count(float diameter){
        System.out.println("Calculating the Area of the Bola");
        this.sum = (float) (Math.PI * diameter);
        return sum;
    }

    public float count(){
        System.out.println("Calculate the Perimeter of the Bola");
        float rad = diameter / 2;
        this.sum = (float) (Math.PI * Math.pow(rad, 2));
        return sum;
    }

    @Override
    public void Display(){
        System.out.println("Total Bola sum : " + sum);
    }
}
