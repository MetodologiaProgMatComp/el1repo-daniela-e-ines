package es.uah.matcomp.mp.e1.ejerciciosclases.P2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point.MyCircle;
import es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point.MyPoint;

import java.util.Arrays;

public class MainMyCircle {
    public static void main(String[]args){
        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        System.out.println(c1.getCenter());
        System.out.println("El area es: " + c1.getArea());
        System.out.println("El perimetro es: " + c1.getCircumference());

        MyCircle c2 = new MyCircle(1, 1, 3);
        System.out.println(c2);

        c2.setCenter(new MyPoint());
        System.out.println(c2);

        c2.setCenterXY(10, 10);
        System.out.println("El nuevo valor es: " + Arrays.toString(c2.getCenterXY()));

        MyCircle c3 = new MyCircle(new MyPoint(2,2), 4);
        System.out.println(c3);

        c3.setCenterX(3);
        c3.setCenterY(5);
        System.out.println("El nuevo valor del centro es: (" + c3.getCenterX() + "," + c3.getCenterY() + ")");

        System.out.println("La distancia entre c1 y c3 es: " + c3.distance(c1));
    }
}
