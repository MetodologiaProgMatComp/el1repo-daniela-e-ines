package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff st1 = new Staff("Luis", "Av.Barcelona", "Buero Vallejo", 23.44);
        assertEquals("Buero Vallejo", st1.getSchool());
    }

    @Test
    void setSchool() {
        Staff st1 = new Staff("Luis", "Av.Barcelona", "Buero Vallejo", 23.44);
        assertDoesNotThrow(()-> st1.setSchool("Ellacuria"));
        assertEquals("Ellacuria", st1.getSchool());
    }

    @Test
    void getPay() {
        Staff st1 = new Staff("Luis", "Av.Barcelona", "Buero Vallejo", 23.44);
        assertEquals(23.44, st1.getPay());
    }

    @Test
    void setPay() {
        Staff st1 = new Staff("Luis", "Av.Barcelona", "Buero Vallejo", 23.44);
        assertDoesNotThrow(()->st1.setPay(50.0));
        assertEquals(50.0, st1.getPay());
    }

    @Test
    void testToString() {
        Staff st1 = new Staff("Luis", "Av.Barcelona", "Buero Vallejo", 23.44);
        assertEquals("Person[name=Luis, address=Av.Barcelona], school= Buero Vallejo, pay=23.44]",
                st1.toString());
    }
}