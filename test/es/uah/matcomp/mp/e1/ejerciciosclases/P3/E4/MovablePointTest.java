package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getXSpeed() {
        MovablePoint m2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        assertEquals(0.5f, m2.getXSpeed());
    }

    @Test
    void setXSpeed() {
        MovablePoint m2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        assertDoesNotThrow(()->m2.setXSpeed(3.0f));
        assertEquals(3.0f, m2.getXSpeed());
    }

    @Test
    void getYSpeed() {
        MovablePoint m2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        assertEquals(0.5f, m2.getYSpeed());
    }

    @Test
    void setYSpeed() {
        MovablePoint m2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        assertDoesNotThrow(()->m2.setYSpeed(3.0f));
        assertEquals(3.0f, m2.getYSpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint m2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        assertEquals("[F@5db250b4", m2.getSpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint m2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        assertDoesNotThrow(()->m2.setSpeed(3.0f,4.0f));
        assertEquals(3.0f, m2.getXSpeed());
        assertEquals(4.0f, m2.getYSpeed());
    }

    @Test
    void testToString() {
        MovablePoint m2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        assertEquals("(1.0,2.0)speed=(0.5,0.5)",m2.toString());
    }

    @Test
    void move() {
        MovablePoint m2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        assertDoesNotThrow(()->m2.move());
        assertEquals("(1.5,2.5)speed=(0.5,0.5)", m2.toString());
    }
}