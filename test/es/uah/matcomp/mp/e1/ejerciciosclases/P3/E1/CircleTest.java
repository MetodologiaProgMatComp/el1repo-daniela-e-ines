package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle ci1 = new Circle();
    Circle ci2 = new Circle(12.0);
    Circle ci3 = new Circle(3.00, "azul");
    @Test
    void getRadius() {
        assertEquals(1,ci1.getRadius());
        assertEquals(12.0, ci2.getRadius());
        assertEquals(3.00, ci3.getRadius());
    }

    @Test
    void setRadius() {
    }

    @Test
    void getColor() {
        assertEquals("red", ci1.getColor());
        assertEquals("red", ci2.getColor());
        assertEquals("azul", ci3.getColor());
    }

    @Test
    void setColor() {
    }

    @Test
    void getArea() {
    }

    @Test
    void testToString() {
    }
}