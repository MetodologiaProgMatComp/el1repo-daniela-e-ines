package es.uah.matcomp.mp.e1.ejerciciosclases.P1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.Rectangle;

public class TestRectangle {
    public static void main (String[]args){

        //Objeto 1
        Rectangle r1 = new Rectangle (1.2f, 3.4f);
        System.out.println (r1);

        //Objeto 2
        Rectangle r2 = new Rectangle();
        System.out.println (r2);

        //Cambiar valores objeto1
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        //Area y Perimetro del objeto1
        System.out.printf ("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}
