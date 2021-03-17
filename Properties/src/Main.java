
import java.util.Scanner;
import properties.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Main {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        ShapeAttributes SA = new ShapeAttributes();
        SA.Display();

        System.out.print("Circle or Triangle : ");
        String Na = S.next();

        if(Na.equalsIgnoreCase("circle")){
            System.out.print("Input Diameter : ");
            float d = S.nextFloat();

            Bola c = new Bola(d);

            System.out.print("Area or perimeter : ");
            String Nb = S.next();
            S.nextLine();

            if(Nb.equalsIgnoreCase("area")){
                c.count(d);
                c.Display();
            }
            else if(Nb.equalsIgnoreCase("perimeter")){
                c.count();
                c.Display();
            }

        }else if(Na.equalsIgnoreCase("triangle")){
            System.out.print("Input Height : ");
            float h = S.nextFloat();

            System.out.print("Input Width : ");
            float w = S.nextFloat();

            System.out.println("Input Sides : ");
            float s = S.nextFloat();

            Triangel t = new Triangel(h,w,s);
            System.out.print("Area or perimeter : ");
            String Nb = S.next();
            S.nextLine();

            if(Nb.equalsIgnoreCase("area")){
                t.count(s);
                t.Display();
            }
            else if(Nb.equalsIgnoreCase("perimeter")){
                t.count(h,w);
                t.Display();
            }
        }
    }
}

