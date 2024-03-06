package es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertEquals(1, l1.getBeginX());
        assertEquals(1, l1.getBeginY());
    }

    @Test
    void setBegin() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertDoesNotThrow(()-> l1.setBegin(new MyPoint(0,0)));
        assertEquals(0, l1.getBeginX());
        assertEquals(0, l1.getBeginY());
    }

    @Test
    void getEnd() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertEquals(4, l1.getEndX());
        assertEquals(4, l1.getEndY());
    }

    @Test
    void setEnd() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertDoesNotThrow(()-> l1.setEnd(new MyPoint(3,3)));
        assertEquals(3, l1.getEndX());
        assertEquals(3, l1.getEndY());
    }

    @Test
    void getBeginX() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertEquals(1, l1.getBeginX());
    }

    @Test
    void setBeginX() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertDoesNotThrow(()-> l1.setBeginX(3));
        assertEquals(3, l1.getBeginX());
    }

    @Test
    void getBeginY() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertEquals(1, l1.getBeginY());
    }

    @Test
    void setBeginY() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertDoesNotThrow(()-> l1.setBeginY(5));
        assertEquals(5, l1.getBeginY());
    }

    @Test
    void getEndX() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertEquals(4, l1.getEndX());
    }

    @Test
    void setEndX() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertDoesNotThrow(()-> l1.setEndX(1));
        assertEquals(1, l1.getEndX());
    }

    @Test
    void getEndY() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertEquals(4, l1.getEndY());
    }

    @Test
    void setEndY() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertDoesNotThrow(()-> l1.setEndY(-1));
        assertEquals(-1, l1.getEndY());
    }

    @Test
    void getBeginXY() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertArrayEquals(new int[]{1, 1}, l1.getBeginXY());
    }

    @Test
    void setBeginXY() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertDoesNotThrow(()-> l1.setBeginXY(0, 0));
        assertEquals(0, l1.getBeginX());
        assertEquals(0, l1.getBeginY());
    }

    @Test
    void getEndXY() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertArrayEquals(new int[]{4, 4}, l1.getEndXY());
    }

    @Test
    void setEndXY() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertDoesNotThrow(()-> l1.setEndXY(4, 4));
        assertEquals(4, l1.getEndX());
        assertEquals(4, l1.getEndY());
    }

    @Test
    void getLength() {
        MyLine l1 = new MyLine(1,0,0,0);
        assertEquals(1,l1.getLength());
    }

    @Test
    void getGradient() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertEquals(-2.356194490192345, l1.getGradient());
    }

    @Test
    void testToString() {
        MyLine l1 = new MyLine(1,1,4,4);
        assertEquals("MyLine[begin=(1,1), end=(4,4)]",l1.toString());
    }
}