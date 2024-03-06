package es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle t1 = new MyTriangle (0, 0, 4, 0, 2, 2);
        assertEquals("MyTriangle [v1 = (0,0), v2 = (4,0), v3 = (2,2)]", t1.toString());
    }

    @Test
    void getPerimeter() {
        MyTriangle t1 = new MyTriangle (0, 0, 4, 0, 2, 2);
        assertEquals(4+Math.sqrt(8)+Math.sqrt(8), t1.getPerimeter());
    }

    @Test
    void getType() {
        MyTriangle t1 = new MyTriangle (0, 0, 4, 0, 2, 2);
        assertEquals("Isósceles", t1.getType());
        MyTriangle t2 = new MyTriangle (new MyPoint(), new MyPoint(3,3), new MyPoint(7,8));
        assertEquals("Escaleno", t2.getType());
    }
}