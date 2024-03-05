package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c3 = new Cylinder (2.0, 10.0);
        assertEquals(10.0, c3.getHeight());
    }

    @Test
    void setHeight() {
        Cylinder c3 = new Cylinder (2.0, 10.0);
        assertDoesNotThrow(()-> c3.setHeight(11.0));
        assertEquals(11.0, c3.getHeight());
    }

    @Test
    void getArea() {
        Cylinder c3 = new Cylinder (2.0, 10.0);
        assertEquals(150.79644737231007, c3.getArea());
    }

    @Test
    void getVolume() {
        Cylinder c3 = new Cylinder (2.0, 10.0);
        assertEquals(125.66370614359172, c3.getVolume());
    }

    @Test
    void testToString() {
        Cylinder c3 = new Cylinder (2.0, 10.0);
        assertEquals("Cylinder: subclass of Circle[radius=2.0, color='red'] height=10.0", c3.toString());
    }
}