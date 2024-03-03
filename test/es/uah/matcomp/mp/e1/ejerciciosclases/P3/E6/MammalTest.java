package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Mammal m1 = new Mammal("Simba");
        assertEquals("Mamal[Animal[name=Simba]]", m1.toString());
    }

}