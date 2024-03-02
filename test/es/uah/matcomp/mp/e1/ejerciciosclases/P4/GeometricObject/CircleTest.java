package es.uah.matcomp.mp.e1.ejerciciosclases.P4.GeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle c1 = new Circle(2.2);
        assertEquals("Circle[radius=2.2]", c1.toString());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle(2.2);
        assertEquals(15.205308443374602, c1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(2.2);
        assertEquals(13.823007675795091, c1.getPerimeter());
    }
}