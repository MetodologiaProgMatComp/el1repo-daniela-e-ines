package es.uah.matcomp.mp.e1.ejerciciosclases.P2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.PointyLine.MyPoint;

public class MainMyPoint {
    public static void main (String[] args) {
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: "+p1.getX()); // Test getters
        System.out.println("y is: "+p1.getY());
        p1.setXY(3,0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version? ---- distance(another:MyPoint):double
        System.out.println(p2.distance(p1)); // which version? ---- distance(another:MyPoint):double
        System.out.println(p1.distance(5,6)); // which version? ---- distance(x:int, y:int):double
        System.out.println(p1.distance()); // which version? ---- distance():double

        // Crear un array de 10 puntos MyPoint
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Mostrar la matriz de distancias entre todos los puntos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("Distancia entre p%d y p%d: %.2f%n", i + 1, j + 1, points[i].distance(points[j]));
            }
        }
    }
}
