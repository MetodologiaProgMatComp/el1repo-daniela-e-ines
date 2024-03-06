package es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.Author;
import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E3.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint p1 = new MyPoint();
        assertEquals(0, p1.getX());
    }

    @Test
    void setX() {
        MyPoint p1 = new MyPoint();
        assertDoesNotThrow(()-> p1.setX(8));
        assertEquals(8, p1.getX());

    }

    @Test
    void getY() {
        MyPoint p1 = new MyPoint();
        assertEquals(0, p1.getY());
    }

    @Test
    void setY() {
        MyPoint p1 = new MyPoint();
        assertDoesNotThrow(()-> p1.setY(6));
        assertEquals(6, p1.getY());
    }

    @Test
    void getXY() {
        MyPoint p1 = new MyPoint();
        assertArrayEquals(new int[]{0, 0}, p1.getXY());
    }

    @Test
    void setXY() {
        MyPoint p1 = new MyPoint();
        assertDoesNotThrow(()-> p1.setXY(3, 0));
        assertEquals(3, p1.getX());
        assertEquals(0, p1.getY());
    }

    @Test
    void testToString() {
        MyPoint p1 = new MyPoint();
        assertEquals("(0,0)", p1.toString());
    }

    @Test
    void distance() {
        MyPoint p1 = new MyPoint(3,0);
        MyPoint p2 = new MyPoint(0,4);
        assertEquals(5, p1.distance(p2));
    }

    @Test
    void testDistance() {
        MyPoint p1 = new MyPoint(3,0);
        assertEquals(3, p1.distance(6,0));
    }

    @Test
    void testDistance1() {
        MyPoint p1 = new MyPoint(3,0);
        assertEquals(3, p1.distance());
    }
}