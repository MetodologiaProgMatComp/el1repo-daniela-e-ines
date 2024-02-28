package es.uah.matcomp.mp.e1.ejerciciosclases.P1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.Ball;

public class MainBall {
    public static void main (String[]args){

        //Objeto 1
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        System.out.println(b1);

        //Test Getters and Setters
        b1.setX(80.0f);
        b1.setY(35.0f);
        b1.setRadius(5);
        b1.setXDelta(4.0f);
        b1.setYDelta(6.0f);
        System.out.println(b1);
        System.out.println("x is: " + b1.getX());
        System.out.println("y is: " + b1.getY());
        System.out.println("radius is: " + b1.getRadius());
        System.out.println("xDelta is: " + b1.getXDelta());
        System.out.println("yDelta is: " + b1.getYDelta());

        //
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i = 0; i < 15; i++){
            b1.move();
            System.out.println(b1);
            float xNew = b1.getX();
            float yNew = b1.getY();
            int radius = b1.getRadius();

            if ((xNew + radius) > xMax || (xNew - radius) < xMin){
                b1.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin){
                b1.reflectVertical();
            }
        }
    }
}
