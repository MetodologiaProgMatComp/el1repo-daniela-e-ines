package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person p1 = new Person("Lucia", "C/Cifuentes");
        assertEquals("Lucia", p1.getName());
    }

    @Test
    void getAddress() {
        Person p1 = new Person("Lucia", "C/Cifuentes");
        assertEquals("C/Cifuentes",p1.getAddress());
    }

    @Test
    void setAddress() {
        Person p1 = new Person("Lucia", "C/Cifuentes");
        assertDoesNotThrow(()-> p1.setAddress("C/Alberti"));
        assertEquals("C/Alberti",p1.getAddress());
    }

    @Test
    void testToString() {
        Person p1 = new Person("Lucia", "C/Cifuentes");
        assertEquals("Person[name=Lucia, address=C/Cifuentes]", p1.toString());
    }
}