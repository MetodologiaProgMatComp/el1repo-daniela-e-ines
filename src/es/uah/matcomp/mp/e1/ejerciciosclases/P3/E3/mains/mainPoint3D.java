package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E3.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E3.Point3D;

import java.util.Arrays;

public class mainPoint3D {
    public static void main(String[]args){
        Point3D p31 = new Point3D(2.0f, 4.2f, 0.5f);
        System.out.println(p31);

        Point3D p32 = new Point3D();
        System.out.println(p32);
        p32.setX(2.00f);
        p32.setY(3.00f);
        p32.setZ(4.00f);
        System.out.println("x = " + p32.getX());
        System.out.println("y = " + p32.getY());
        System.out.println("z = " + p32.getZ());

        p32.setXYZ(1.00f, 1.00f, 1.00f);
        System.out.println("[x, y, z] = " + Arrays.toString(p32.getXYZ()));
    }
}
