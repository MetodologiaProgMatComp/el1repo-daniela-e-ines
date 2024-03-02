package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(1.1f, b1.getX());
    }

    @Test
    void setX() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->b1.setX(80.0f));
        assertEquals(80.0f, b1.getX());
    }

    @Test
    void getY() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(2.2f, b1.getY());
    }

    @Test
    void setY() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->b1.setY(35.0f));
        assertEquals(35.0f, b1.getY());
    }

    @Test
    void getRadius() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(10, b1.getRadius());
    }

    @Test
    void setRadius() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->b1.setRadius(5));
        assertEquals(5, b1.getRadius());
    }

    @Test
    void getXDelta() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(3.3f, b1.getXDelta());
    }

    @Test
    void setXDelta() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->b1.setXDelta(4.0f));
        assertEquals(4.0f, b1.getXDelta());
    }

    @Test
    void getYDelta() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(4.4f, b1.getYDelta());
    }

    @Test
    void setYDelta() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->b1.setYDelta(6.0f));
        assertEquals(6.0f, b1.getYDelta());
    }

    @Test
    void move() {
        Ball b1 = new Ball (1f, 2f, 10, 3f, 4f);
        b1.move();
        assertEquals(4f, b1.getX());
        assertEquals(6f, b1.getY());
    }

    @Test
    void reflectHorizontal() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->b1.reflectHorizontal());
        assertEquals(-1.1f, b1.getX());
    }

    @Test
    void reflectVertical() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->b1.reflectVertical());
        assertEquals(-2.2f, b1.getY());
    }

    @Test
    void testToString() {
        Ball b1 = new Ball (1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertDoesNotThrow(()->b1.toString());
        assertEquals("Ball [(1.1,2.2), speed = (3.3,4.4)]", b1.toString());
    }
}