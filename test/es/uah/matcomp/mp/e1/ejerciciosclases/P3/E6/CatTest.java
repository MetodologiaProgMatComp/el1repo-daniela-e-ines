package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat c1 = new Cat("Pepa");
        assertDoesNotThrow(()-> c1.greets());
    }

    @Test
    void testToString() {
        Cat c1 = new Cat("Pepa");
        assertEquals("Cat[Mamal[Animal[name=Pepa]]]", c1.toString());
    }
}