package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6Composicion.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog d1 = new Dog("Calcetines");
        assertDoesNotThrow(()-> d1.greets());
    }

    @Test
    void testGreets() {
        Dog d1 = new Dog("Calcetines");
        Dog d2 = new Dog("Zapatos");
        assertDoesNotThrow(()-> d1.greets(d2));
    }

    @Test
    void testToString() {
        Dog d1 = new Dog("Calcetines");
        assertEquals("Dog[Mamal[Animal[name=Calcetines]]]",d1.toString());
    }

}