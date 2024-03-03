package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square s4 = new Square(6.6);
        assertEquals(6.6, s4.getSide());
    }

    @Test
    void setSide() {
        Square s4 = new Square(6.6);
        assertDoesNotThrow(()-> s4.setSide(9.0));
        assertEquals(9.0, s4.getSide());
    }

    @Test
    void setWidth() {
        Square s4 = new Square(6.6);
        assertDoesNotThrow(()-> s4.setWidth(9.0));
        assertEquals(9.0, s4.getWidth());
    }

    @Test
    void setLength() {
        Square s4 = new Square(6.6);
        assertDoesNotThrow(()-> s4.setLength(9.0));
        assertEquals(9.0, s4.getLength());
    }

    @Test
    void testToString() {
        Square s4 = new Square(6.6);
        assertEquals("Square[Rectangle[Shape[color=red,filled=true],width=6.6,length6.6]]",
                s4.toString());
    }

}