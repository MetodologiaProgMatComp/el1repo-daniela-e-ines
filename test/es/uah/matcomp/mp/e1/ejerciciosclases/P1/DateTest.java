package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date d1 = new Date (1, 2, 2014);
        assertEquals(1, d1.getDay());
    }

    @Test
    void setDay() {
        Date d1 = new Date (1, 2, 2014);
        assertDoesNotThrow(()->d1.setDay(2));
        assertEquals(2,d1.getDay());
    }

    @Test
    void getMonth() {
        Date d1 = new Date (1, 2, 2014);
        assertEquals(2, d1.getMonth());
    }

    @Test
    void setMonth() {
        Date d1 = new Date (1, 2, 2014);
        assertDoesNotThrow(()->d1.setMonth(10));
        assertEquals(10,d1.getMonth());
    }

    @Test
    void getYear() {
        Date d1 = new Date (1, 2, 2014);
        assertEquals(2014, d1.getYear());
    }

    @Test
    void setYear() {
        Date d1 = new Date (1, 2, 2014);
        assertDoesNotThrow(()->d1.setYear(2010));
        assertEquals(2010,d1.getYear());
    }

    @Test
    void setDate() {
        Date d1 = new Date (1, 2, 2014);
        assertDoesNotThrow(()->d1.setDay(2));
        assertEquals(2,d1.getDay());
        assertDoesNotThrow(()->d1.setMonth(10));
        assertEquals(10,d1.getMonth());
        assertDoesNotThrow(()->d1.setYear(2010));
        assertEquals(2010,d1.getYear());
    }

    @Test
    void testToString() {
        Date d1 = new Date (1, 2, 2014);
        assertEquals("01/02/2014", d1.toString());
    }
}