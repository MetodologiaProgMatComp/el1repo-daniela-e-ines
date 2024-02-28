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
        Account a1 = new Account("1","Ana",88);
        assertEquals(88,a1.getBalance());
    }

    @Test
    void credit() {
        Account a1 = new Account("1","Ana",88);
        assertEquals(90,a1.Credit(2));
    }

    @Test
    void debit() {
        Account a1 = new Account("1","Ana",88);
        assertEquals(86,a1.Debit(2));
    }

    @Test
    void transferTo() {
        Account a1 = new Account("1","Ana",88);
        Account a2 = new Account("1","Ana",93);
        assertEquals(86,a1.TransferTo(a2,2));
    }

    @Test
    void testToString() {
        Account a1 = new Account("1","Ana",88);
        assertEquals("Account[id='1', name='Ana', balance=88]",a1.toString());
    }
}