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
public class Triangel extends ShapeAttributes{
    public Triangel(float height, float width, float side) {
       this.height = height;
       this.width = width;
       this.side = side;
    }

    public float count(float side){
        System.out.println("Calculate the Perimeter of the Triangle");
        this.sum = side + side + side;
        return sum;
    }
    public float count(float height, float width){
        System.out.println("Calculate the Area of the Triangle");
        this.sum = height * width / 2;
        return sum;
    }

    @Override
    public void Display(){
        System.out.println("Total Triangel sum : " + sum);
    }
}
    

