package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time t1 = new Time(1, 2, 3);
        assertEquals(1, t1.getHour());
    }

    @Test
    void setHour() {
        Time t1 = new Time(1, 2, 3);
        assertDoesNotThrow(()->t1.setHour(10));
        assertEquals(10, t1.getHour());
    }

    @Test
    void getMinute() {
        Time t1 = new Time(1, 2, 3);
        assertEquals(2, t1.getMinute());
    }

    @Test
    void setMinute() {
        Time t1 = new Time(1, 2, 3);
        assertDoesNotThrow(()->t1.setMinute(20));
        assertEquals(20, t1.getMinute());
    }

    @Test
    void getSecond() {
        Time t1 = new Time(1, 2, 3);
        assertEquals(3, t1.getSecond());
    }

    @Test
    void setSecond() {
        Time t1 = new Time(1, 2, 3);
        assertDoesNotThrow(()->t1.setSecond(30));
        assertEquals(30, t1.getSecond());
    }

    @Test
    void setTime() {
        Time t1 = new Time(1, 2, 3);
        assertDoesNotThrow(()->t1.setTime(10,20,30));
        assertEquals(10, t1.getHour());
        assertEquals(20, t1.getMinute());
        assertEquals(30, t1.getSecond());
    }

    @Test
    void testToString() {
        Time t1 = new Time(1, 2, 3);
        assertEquals("01:02:03", t1.toString());
    }

    @Test
    void nextSecond() {
        Time t1 = new Time(1, 2, 3);
        assertEquals(new Time (01,02,04), t1.nextSecond());
    }

    @Test
    void previousSecond() {
    }
}