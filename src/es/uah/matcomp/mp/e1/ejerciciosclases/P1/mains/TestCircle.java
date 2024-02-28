package es.uah.matcomp.mp.e1.ejerciciosclases.P1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.Circle;

public class TestCircle {
    public static void main (String[]args){

        //Objeto 1
        Circle c1 = new Circle (1.1);
        System.out.println (c1);

        //Objeto 2
        Circle c2 = new Circle ();
        System.out.println (c2);

        //Cambio valor objeto1
        c1.setRadio(2.2);
        System.out.println (c1);
        System.out.println ("el radio es: " + c1.getRadio());

        //Area y Circunferencia del objeto1
        System.out.printf("area es: %.2f%n", c1.getArea());
        System.out.printf("circunferencia es: %.2f%n", c1.getCircunference());
        // %.2f%n redondea los numeros a dos decimales
    }
}
