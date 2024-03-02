package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E3.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E3.Point2D;

import java.util.Arrays;

public class mainPoint2D {
    public static void main(String[]args){
        Point2D p1 = new Point2D(5.00f, 6.00f);
        System.out.println(p1);

        Point2D p2 = new Point2D();
        System.out.println(p2);

        p2.setX(2.00f);
        p2.setY(3.00f);
        System.out.println("x = " + p2.getX());
        System.out.println("y = " + p2.getY());

        p2.setXY(3.00f, 4.00f);
        System.out.println("x, y = " + Arrays.toString(p2.getXY()));
    }
}
