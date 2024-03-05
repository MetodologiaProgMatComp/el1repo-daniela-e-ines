package es.uah.matcomp.mp.e1.ejerciciosclases.P4.E4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testToString() {
        MovablePoint m1 = new MovablePoint(1, 2, 3,4);
        assertEquals("(1,2), speed=(3,4)",m1.toString());
    }

    @Test
    void moveUp() {
        MovablePoint m1 = new MovablePoint(1, 2, 3,4);
        assertDoesNotThrow(()-> m1.moveUp());
        assertEquals("(1,-2), speed=(3,4)", m1.toString());
    }

    @Test
    void moveDown() {
        MovablePoint m1 = new MovablePoint(1, 2, 3,4);
        assertDoesNotThrow(()-> m1.moveDown());
        assertEquals("(1,6), speed=(3,4)", m1.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint m1 = new MovablePoint(1, 2, 3,4);
        assertDoesNotThrow(()-> m1.moveLeft());
        assertEquals("(-2,2), speed=(3,4)", m1.toString());
    }

    @Test
    void moveRight() {
        MovablePoint m1 = new MovablePoint(1, 2, 3,4);
        assertDoesNotThrow(()-> m1.moveRight());
        assertEquals("(4,2), speed=(3,4)", m1.toString());
    }
}