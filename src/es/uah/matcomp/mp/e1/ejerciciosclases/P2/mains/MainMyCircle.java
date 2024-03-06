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
        c2.setRadius(2);
        System.out.println(c2);

        c2.setCenterXY(0, 4);
        System.out.println("El nuevo valor es: " + Arrays.toString(c2.getCenterXY()));

        MyCircle c3 = new MyCircle(new MyPoint(6,2), 4);
        System.out.println(c3);

        c3.setCenterX(3);
        c3.setCenterY(0);
        System.out.println("El nuevo valor del centro es: (" + c3.getCenterX() + "," + c3.getCenterY() + ")");

        System.out.println("La distancia entre c2 y c3 es: " + c2.distance(c3));
    }
}
