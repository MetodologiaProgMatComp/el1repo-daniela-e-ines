package es.uah.matcomp.mp.e1.ejerciciosclases.P4.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P4.GeometricObject.Circle;
import es.uah.matcomp.mp.e1.ejerciciosclases.P4.GeometricObject.Rectangle;

public class MainGeometricObject {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.2);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Rectangle r1 = new Rectangle(2.0,4.0);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
