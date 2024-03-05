package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5.Circle;
import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5.Rectangle;
import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5.Square;

public class MainShape {
    public static void main(String[] args) {
        es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5.Circle c1 = new Circle(5.5, "red", false);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());


        es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5.Rectangle r1 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());


        es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5.Square s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());
    }
}
