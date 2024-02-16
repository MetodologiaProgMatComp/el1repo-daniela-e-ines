package es.uah.matcomp.mp.e1.ejerciciosclases;

public class TestCircle {
    public static void main (String[]args){
        Circle c1 = new Circle (1.1);
        System.out.println (c1);

        Circle c2 = new Circle ();
        System.out.println (c2);

        c1.setRadio(2.2);
        System.out.println (c1);
        System.out.println ("el radio es: " + c1.getRadio());

        System.out.printf("area es: %.2f%n", c1.getArea());
        System.out.printf("circunferencia es: %.2f%n", c1.getCircunference());
        // %.2f%n redondea los numeros a dos decimales
    }
}
