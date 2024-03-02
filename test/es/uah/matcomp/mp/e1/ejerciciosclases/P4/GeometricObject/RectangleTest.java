package es.uah.matcomp.mp.e1.ejerciciosclases.P4.GeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(2.0, 4.0);
        assertEquals("Rectangle[width=2.0,length=4.0]",r1.toString());
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(2.0, 4.0);
        assertEquals(8.0, r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(2.0, 4.0);
        assertEquals(12.0, r1.getPerimeter());
    }
}