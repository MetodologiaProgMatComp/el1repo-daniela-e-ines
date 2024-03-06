package es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getCenter() {
        MyCircle c1 = new MyCircle();
        assertEquals(0, c1.getCenterX());
        assertEquals(0, c1.getCenterY());
    }

    @Test
    void setCenter() {
        MyCircle c1 = new MyCircle();
        assertDoesNotThrow(()-> c1.setCenter(new MyPoint(1,1)));
        assertEquals(1, c1.getCenterX());
        assertEquals(1, c1.getCenterY());
    }

    @Test
    void getRadius() {
        MyCircle c1 = new MyCircle();
        assertEquals(1, c1.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle c1 = new MyCircle();
        assertDoesNotThrow(()-> c1.setRadius(2));
        assertEquals(2, c1.getRadius());
    }

    @Test
    void getCenterX() {
        MyCircle c1 = new MyCircle();
        assertEquals(0, c1.getCenterX());
    }

    @Test
    void setCenterX() {
        MyCircle c1 = new MyCircle();
        assertDoesNotThrow(()-> c1.setCenterX(2));
        assertEquals(2, c1.getCenterX());
    }

    @Test
    void getCenterY() {
        MyCircle c1 = new MyCircle();
        assertEquals(0, c1.getCenterY());
    }

    @Test
    void setCenterY() {
        MyCircle c1 = new MyCircle();
        assertDoesNotThrow(()-> c1.setCenterY(2));
        assertEquals(2, c1.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyCircle c1 = new MyCircle();
        assertArrayEquals(new int[]{0, 0}, c1.getCenterXY());
    }

    @Test
    void setCenterXY() {
        MyCircle c1 = new MyCircle();
        assertDoesNotThrow(()-> c1.setCenterXY(2,2));
        assertArrayEquals(new int[]{2, 2}, c1.getCenterXY());
    }

    @Test
    void testToString() {
        MyCircle c1 = new MyCircle();
        assertEquals("MyCircle[radius = 1, center = (0,0)]", c1.toString());
    }

    @Test
    void getArea() {
        MyCircle c1 = new MyCircle();
        assertEquals(Math.PI, c1.getArea());
    }

    @Test
    void getCircumference() {
        MyCircle c1 = new MyCircle();
        assertEquals(2*Math.PI,c1.getCircumference());
    }

    @Test
    void distance() {
        MyCircle c2 = new MyCircle(new MyPoint(0,4),2);
        MyCircle c3 = new MyCircle(new MyPoint(3,0),1);
        assertEquals(5, c2.distance(c3));
    }
}