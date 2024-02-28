package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account a1 = new Account("1","Ana");
        assertEquals("1",a1.getId());
    }

    @Test
    void getName() {
        Account a1 = new Account("1","Ana");
        assertEquals("Ana",a1.getName());
    }

    @Test
    void getBalance() {
        Account a1 = new Account("1","Ana");
        assertEquals("Ana",a1.getName());
    }

    @Test
    void credit() {
    }

    @Test
    void debit() {
    }

    @Test
    void transferTo() {
    }

    @Test
    void testToString() {
    }
}