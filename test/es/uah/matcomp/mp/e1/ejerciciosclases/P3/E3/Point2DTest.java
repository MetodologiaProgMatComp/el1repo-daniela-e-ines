package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D p1 = new Point2D(5.00f, 6.00f);
        assertEquals(5.00f, p1.getX());
    }

    @Test
    void setX() {
        Point2D p1 = new Point2D(5.00f, 6.00f);
        assertDoesNotThrow(()-> p1.setX(8.00f));
        assertEquals(8.00f, p1.getX());
    }

    @Test
    void getY() {
        Point2D p1 = new Point2D(5.00f, 6.00f);
        assertEquals(6.00f, p1.getY());
    }

    @Test
    void setY() {
        Point2D p1 = new Point2D(5.00f, 6.00f);
        assertDoesNotThrow(()-> p1.setY(8.00f));
        assertEquals(8.00f, p1.getY());
    }

    @Test
    void setXY() {
        Point2D p1 = new Point2D(5.00f, 6.00f);
        assertDoesNotThrow(()-> p1.setXY(8.00f, 10.00f));
        assertEquals(8.00f, p1.getX());
        assertEquals(10.00f, p1.getY());
    }

    @Test
    void getXY() {
        Point2D p1 = new Point2D(5.00f, 6.00f);
        assertEquals("[F@290d210d", p1.getXY());
    }

    @Test
    void testToString() {
        Point2D p1 = new Point2D(5.00f, 6.00f);
        assertEquals("[5.0, 6.0]", p1.toString());
    }
}