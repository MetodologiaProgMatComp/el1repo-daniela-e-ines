package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle(3.00, "Azul");
        assertEquals(3.00, c1.getRadius());
    }

    @Test
    void setRadius() {
        Circle c1 = new Circle(3.00, "Azul");
        assertDoesNotThrow(()-> c1.setRadius(4.00));
        assertEquals(4.00, c1.getRadius());
    }

    @Test
    void getColor() {
        Circle c1 = new Circle(3.00, "Azul");
        assertEquals("Azul", c1.getColor());
    }

    @Test
    void setColor() {
        Circle c1 = new Circle(3.00, "Azul");
        assertDoesNotThrow(()-> c1.setColor("Red"));
        assertEquals("Red", c1.getColor());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle(3.00, "Azul");
        assertEquals(28.274333882308138, c1.getArea());
    }

    @Test
    void testToString() {
        Circle c1 = new Circle(3.00, "Azul");
        assertEquals("Circle[radius=3.0, color='Azul']", c1.toString());
    }
}