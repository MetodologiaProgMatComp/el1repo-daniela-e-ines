package es.uah.matcomp.mp.e1.ejerciciosclases.P4.E4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle c1 = new MovableCircle(1, 2, 3, 4,6);
        assertEquals("(1,2), speed=(3,4),radius=6", c1.toString());
    }

    @Test
    void moveUp() {
        MovableCircle c1 = new MovableCircle(1, 2, 3, 4,6);
        assertDoesNotThrow(()-> c1.moveUp());
        assertEquals("(1,-2), speed=(3,4),radius=6", c1.toString());
    }

    @Test
    void moveDown() {
        MovableCircle c1 = new MovableCircle(1, 2, 3, 4,6);
        assertDoesNotThrow(()-> c1.moveDown());
        assertEquals("(1,6), speed=(3,4),radius=6", c1.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle c1 = new MovableCircle(1, 2, 3, 4,6);
        assertDoesNotThrow(()-> c1.moveLeft());
        assertEquals("(-2,2), speed=(3,4),radius=6", c1.toString());
    }

    @Test
    void moveRight() {
        MovableCircle c1 = new MovableCircle(1, 2, 3, 4,6);
        assertDoesNotThrow(()-> c1.moveRight());
        assertEquals("(4,2), speed=(3,4),radius=6", c1.toString());
    }
}