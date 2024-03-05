package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6Composicion.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal a1 = new Animal("Leo");
        assertEquals("Animal[name=Leo]", a1.toString());
    }
}