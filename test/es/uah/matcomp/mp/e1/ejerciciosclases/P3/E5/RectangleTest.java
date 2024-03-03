package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getColor() {
        Rectangle r3 = new Rectangle(1.0, 2.0, "red", false);
        assertEquals("red", r3.getColor() );
    }

    @Test
    void isFilled() {
        Rectangle r3 = new Rectangle(1.0, 2.0, "red", false);
        assertEquals(false, r3.isFilled());
    }

    @Test
    void getWidth() {
        Rectangle r3 = new Rectangle(1.0, 2.0, "red", false);
        assertEquals(1.0, r3.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r3 = new Rectangle(1.0, 2.0, "red", false);
        assertDoesNotThrow(()->r3.setWidth(4.0));
        assertEquals(4.0, r3.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r3 = new Rectangle(1.0, 2.0, "red", false);
        assertEquals(2.0, r3.getLength());
    }

    @Test
    void setLength() {
        Rectangle r3 = new Rectangle(1.0, 2.0, "red", false);
        assertDoesNotThrow(()-> r3.setLength(5.0));
        assertEquals(5.0, r3.getLength());
    }

    @Test
    void getArea() {
        Rectangle r3 = new Rectangle(1.0, 2.0, "red", false);
        assertEquals(2.0, r3.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r3 = new Rectangle(1.0, 2.0, "red", false);
        assertEquals(6.0, r3.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r3 = new Rectangle(1.0, 2.0, "red", false);
        assertEquals("Rectangle[Shape[color=red,filled=false],width=1.0,length2.0]",
                r3.toString());
    }

}