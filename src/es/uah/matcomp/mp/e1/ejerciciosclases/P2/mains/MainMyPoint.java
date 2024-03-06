package es.uah.matcomp.mp.e1.ejerciciosclases.P2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point.MyPoint;

import java.util.Arrays;

public class MainMyPoint {
    public static void main (String[] args) {
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint();
        System.out.println(p1);

        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        p1.setXY(3, 0);
        System.out.println(Arrays.toString(p1.getXY()));
        System.out.println(Arrays.toString(p1.getXY()));
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(6, 0));
        System.out.println(p1.distance());
    }
}
