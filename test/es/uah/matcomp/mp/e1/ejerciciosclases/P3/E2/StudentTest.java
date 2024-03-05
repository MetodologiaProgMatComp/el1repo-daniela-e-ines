package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student s1 = new Student("Andrea", "C/Tinte", "E.S.O", 2024, 0.00);
        assertEquals("E.S.O", s1.getProgram());
    }

    @Test
    void setProgram() {
        Student s1 = new Student("Andrea", "C/Tinte", "E.S.O", 2024, 0.00);
        assertDoesNotThrow(()->s1.setProgram("Bachillerato"));
        assertEquals("Bachillerato", s1.getProgram());
    }

    @Test
    void getYear() {
        Student s1 = new Student("Andrea", "C/Tinte", "E.S.O", 2024, 0.00);
        assertEquals(2024, s1.getYear());
    }

    @Test
    void setYear() {
        Student s1 = new Student("Andrea", "C/Tinte", "E.S.O", 2024, 0.00);
        assertDoesNotThrow(()-> s1.setYear(2023));
        assertEquals(2023, s1.getYear());
    }

    @Test
    void getFee() {
        Student s1 = new Student("Andrea", "C/Tinte", "E.S.O", 2024, 0.00);
        assertEquals(0.00, s1.getFee());
    }

    @Test
    void setFee() {
        Student s1 = new Student("Andrea", "C/Tinte", "E.S.O", 2024, 0.00);
        assertDoesNotThrow(()-> s1.setFee(1.25));
        assertEquals(1.25, s1.getFee());
    }

    @Test
    void testToString() {
        Student s1 = new Student("Andrea", "C/Tinte", "E.S.O", 2024, 0.00);
        assertEquals("Person[name=Andrea, address=C/Tinte], program= E.S.O, year= 2024, fee= 0.0]",
                s1.toString());
    }
}