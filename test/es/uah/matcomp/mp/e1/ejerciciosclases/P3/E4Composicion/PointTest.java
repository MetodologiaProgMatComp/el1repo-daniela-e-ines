package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E4Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E4Composicion.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point p1 = new Point(2f, 3f);
        assertEquals(2f, p1.getX());
    }

    @Test
    void setX() {
        Point p1 = new Point(2f, 3f);
        assertDoesNotThrow(()->p1.setX(4f));
        assertEquals(4f, p1.getX());
    }

    @Test
    void getY() {
        Point p1 = new Point(2f, 3f);
        assertEquals(3f, p1.getY());
    }

    @Test
    void setY() {
        Point p1 = new Point(2f, 3f);
        assertDoesNotThrow(()->p1.setY(4f));
        assertEquals(4f, p1.getY());
    }

    @Test
    void setXY() {
        Point p1 = new Point(2f, 3f);
        assertDoesNotThrow(()->p1.setXY(4f,4f));
        assertEquals(4f, p1.getX());
        assertEquals(4f, p1.getY());
    }

    @Test
    void getXY() {
        Point p1 = new Point(2f, 3f);
        assertEquals("[F@21507a04", p1.getXY());
    }

    @Test
    void testToString() {
        Point p1 = new Point(2f, 3f);
        assertEquals("(2.0,3.0)", p1.toString());
    }

}