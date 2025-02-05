package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1.Cylinder;

public class MainCylinderComposicion {
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

        es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1Composicion.Cylinder c4 = new es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1Composicion.Cylinder(2,3,"Azul");
        System.out.println(c4);
    }
}
