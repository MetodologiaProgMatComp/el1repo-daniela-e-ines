package es.uah.matcomp.mp.e1.ejerciciosclases.P4.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P4.Movable.MovablePoint;

public class MainMovable {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(1, 2, 3,4);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}
