package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadio() {
        Circle c1 = new Circle (1.1);
        assertEquals(1.1,c1.getRadio());
    }

    @Test
    void setRadio() {
        Circle c1 = new Circle (1.1);
        assertDoesNotThrow(()->c1.setRadio(2.0));
        assertEquals(2.0, c1.getRadio());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle (2.2);
        assertEquals(15.205308443374602, c1.getArea());
    }

    @Test
    void getCircunference() {
        Circle c1 = new Circle (2.2);
    }

    @Test
    void testToString() {
    }
}