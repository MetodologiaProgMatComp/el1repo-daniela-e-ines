package es.uah.matcomp.mp.e1.ejerciciosclases.P2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point.MyPoint;
import es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point.MyTriangle;

public class MainMyTriangle {
    public static void main (String[]args) {
        MyTriangle t1 = new MyTriangle(0, 0, 4, 0, 2, 2);
        System.out.println(t1);

        System.out.println("Perimeter t1=" + t1.getPerimeter());
        System.out.println("Type t1:"+t1.getType());

        MyTriangle t2 = new MyTriangle(new MyPoint(), new MyPoint(3,5), new MyPoint(6,0));
        System.out.println(t2);

        System.out.println("Perimeter t2=" + t2.getPerimeter());
        System.out.println("Type t2:"+t2.getType());

    }
}
