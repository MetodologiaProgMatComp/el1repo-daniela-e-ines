package es.uah.matcomp.mp.e1.ejerciciosclases.P4.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P4.E4.Movable;
import es.uah.matcomp.mp.e1.ejerciciosclases.P4.E4.MovablePoint;
import es.uah.matcomp.mp.e1.ejerciciosclases.P4.E4.MovableCircle;


public class MainE4 {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);

        MovableCircle c1 = new MovableCircle(1, 2, 3, 4,6);
        System.out.println(c1);
        c1.moveUp();
        System.out.println(c1);
        c1.moveDown();
        System.out.println(c1);
        c1.moveLeft();
        System.out.println(c1);
        c1.moveRight();
        System.out.println(c1);
    }
}
