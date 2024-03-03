package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E4;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E4.Point;
public class MainPoint {
    public static void main(String[] args) {
        Point p1 = new Point(2f,3f);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.getXY());

        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);

    }
}
