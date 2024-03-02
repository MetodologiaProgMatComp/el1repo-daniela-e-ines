package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1.Circle;

public class mainCircle {
    public static void main(String[]args){
        Circle ci1 = new Circle();
        System.out.println(ci1);

        Circle ci2 = new Circle(12.0);
        System.out.println(ci2);

        Circle ci3 = new Circle(3.00, "Azul");
        System.out.println(ci3);

        System.out.println("radius = " + ci3.getRadius());
        ci3.setRadius(5.0);
        System.out.println(ci3);

        System.out.println("color = " + ci3.getColor());
        ci3.setColor("Verde");
        System.out.println(ci3);

        System.out.println("area = " + ci3.getArea());
    }
}
