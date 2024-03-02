package es.uah.matcomp.mp.e1.ejerciciosclases.P6.mains;

//import es.uah.matcomp.mp.e1.ejerciciosclases.P6.Shape;

import es.uah.matcomp.mp.e1.ejerciciosclases.P6.Shape.Circle;
import es.uah.matcomp.mp.e1.ejerciciosclases.P6.Shape.Rectangle;
import es.uah.matcomp.mp.e1.ejerciciosclases.P6.Shape.Square;

public class MainShapeCircleRectangle {
    public static void main(String[] args){
        Circle s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(s1); // which version? toString() de Circle heredado de Shape
        System.out.println(s1.getArea()); // which version?  getArea() obligado a tenerla por la clase Shape, pero personalizado
        System.out.println(s1.getPerimeter()); // which version? getPerimeter() obligado a tenerla por la clase Shape, pero personalizado
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape();   No se puede instanciar una clase abstracta y menos en el main

        Rectangle s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Square s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); Rectangle no puede devolver side, ya que no tiene solo uno, tiene width y length
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());


    }
}


//Las clases abstractas engloban métodos comunes, hacen más compacto el código, además
// obligan a las clases hijas a tener los métodos que tenga la clase abstracta.
// Además, permite crear objetos y clases más complejos a partir de objetos y clases
// más simples.