package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5Composicion.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1 = new Shape("blue",false);
        assertEquals("blue", s1.getColor());
    }

    @Test
    void setColor() {
        Shape s1 = new Shape("blue",false);
        assertDoesNotThrow(()-> s1.setColor("red"));
        assertEquals("red", s1.getColor());
    }

    @Test
    void isFilled() {
        Shape s1 = new Shape("blue",false);
        assertEquals(false, s1.isFilled());
    }

    @Test
    void setFilled() {
        Shape s1 = new Shape("blue",false);
        assertDoesNotThrow(()-> s1.setFilled(true));
        assertEquals(true, s1.isFilled());
    }


    @Test
    void testToString() {
        Shape s1 = new Shape("blue",false);
        assertEquals("Shape[color=blue,filled=false]", s1.toString());
    }
}