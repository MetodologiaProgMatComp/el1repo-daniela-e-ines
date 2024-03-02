package es.uah.matcomp.mp.e1.ejerciciosclases.P2.PointyLine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint p1 = new MyPoint(0, 4);
        assertEquals(0, p1.getX());
    }

    @Test
    void setX() {
        MyPoint p1 = new MyPoint(0, 4);
        assertDoesNotThrow(()->p1.setX(1));
        assertEquals(1, p1.getX());
    }

    @Test
    void getY() {
        MyPoint p1 = new MyPoint(0, 4);
        assertEquals(4, p1.getY());
    }

    @Test
    void setY() {
        MyPoint p1 = new MyPoint(0, 4);
        assertDoesNotThrow(()->p1.setY(1));
        assertEquals(1, p1.getY());
    }

    /*@Test
    void getXY() {
        MyPoint p1 = new MyPoint(0, 4);
        int[] numeros = {0,4};
        assertEquals(numeros, p1.getXY());
    }*/

    /*@Test
    void setXY() {

    }*/

    @Test
    void testToString() {
        MyPoint p1 = new MyPoint(0, 4);
        assertEquals("(0,4)", p1.toString());
    }

    @Test
    void distance() {
        MyPoint p1 = new MyPoint(0, 4);
        assertEquals(4,p1.distance(0,0));
    }

    @Test
    void testDistance() {
        MyPoint p1 = new MyPoint(0, 4);
        MyPoint p2 = new MyPoint();
        assertEquals(4,p1.distance(p2));
    }

    @Test
    void testDistance1() {
        MyPoint p1 = new MyPoint(0, 4);
        assertEquals(4, p1.distance());
    }
}