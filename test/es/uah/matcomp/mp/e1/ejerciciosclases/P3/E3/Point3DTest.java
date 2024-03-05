package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D p1 = new Point3D(2.0f, 4.2f, 0.5f);
        assertEquals(0.5f, p1.getZ());
    }

    @Test
    void setZ() {
        Point3D p1 = new Point3D(2.0f, 4.2f, 0.5f);
        assertDoesNotThrow(()-> p1.setZ(2.0f));
        assertEquals(2.0f, p1.getZ());
    }

    @Test
    void setXYZ() {
        Point3D p1 = new Point3D(2.0f, 4.2f, 0.5f);
        assertDoesNotThrow(()->p1.setXYZ(8.00f, 10.00f, 15.00f));
        assertEquals(8.00f, p1.getX());
        assertEquals(10.00f, p1.getY());
        assertEquals(15.00f, p1.getZ());
    }

    @Test
    void getXYZ() {
        Point3D p1 = new Point3D(2.0f, 4.2f, 0.5f);
        assertEquals("[F@475e586c", p1.getXYZ());
    }

    @Test
    void testToString() {
        Point3D p1 = new Point3D(2.0f, 4.2f, 0.5f);
        assertEquals("[2.0, 4.2, 0.5]", p1.toString());
    }
}