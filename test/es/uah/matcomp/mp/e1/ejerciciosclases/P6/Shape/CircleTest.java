package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getColor() {
        Circle s1 = new Circle(5.5, "red", false);
        assertEquals("red", s1.getColor());
    }

    @Test
    void isFilled() {
        Circle s1 = new Circle(5.5, "red", false);
        assertEquals(false, s1.isFilled());
    }

    @Test
    void getRadius() {
        Circle s1 = new Circle(5.5, "red", false);
        assertEquals(5.5, s1.getRadius());
    }

    @Test
    void setRadius() {
        Circle s1 = new Circle(5.5, "red", false);
        assertDoesNotThrow(()-> s1.setRadius(6.0));
        assertEquals(6.0, s1.getRadius());
    }

    @Test
    void getArea() {
        Circle s1 = new Circle(5.5, "red", false);
        assertEquals(95.03317777109123, s1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle s1 = new Circle(5.5, "red", false);
        assertEquals(34.55751918948772, s1.getPerimeter());
    }

    @Test
    void testToString() {
        Circle s1 = new Circle(5.5, "red", false);
        assertEquals("Circle[Shape[color='red,filled=false],radius=5.5]", s1.toString());
    }
}