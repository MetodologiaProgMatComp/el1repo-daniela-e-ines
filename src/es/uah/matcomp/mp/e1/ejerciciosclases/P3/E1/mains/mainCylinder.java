package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1.Cylinder;

public class mainCylinder {
    public static void main(String[]args){
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder: radius= " + c1.getRadius()
        + ", height= " + c1.getHeight() + ", area= " + c1.getArea() +
        ", volume= " + c1.getVolume());

        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder: radius= " + c2.getRadius()
                + ", height= " + c2.getHeight() + ", area= " + c2.getArea() +
                ", volume= " + c2.getVolume());

        Cylinder c3 = new Cylinder (2.0, 10.0);
        System.out.println("Cylinder: radius= " + c3.getRadius()
                + ", height= " + c3.getHeight() + ", area= " + c3.getArea() +
                ", volume= " + c3.getVolume());

        System.out.println(c3);

        Cylinder c4 = new Cylinder(3.0, 5.0, "Amarillo");
        System.out.println(c4);
        c4.setHeight(2.00);
        System.out.println("New height: " + c4.getHeight());
    }
}
