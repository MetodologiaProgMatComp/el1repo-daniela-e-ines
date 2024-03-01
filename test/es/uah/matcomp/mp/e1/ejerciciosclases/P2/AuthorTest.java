package es.uah.matcomp.mp.e1.ejerciciosclases.P2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertEquals("Tan Ah Teck", ahTeck.getName());
    }

    @Test
    void getEmail() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertEquals("ahteck@nowhere.com", ahTeck.getEmail());
    }

    @Test
    void getGender() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertEquals('m',ahTeck.getGender());
    }

    @Test
    void setEmail() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertDoesNotThrow(()-> ahTeck.setEmail("ahteck2@gmail.com"));
        assertEquals("ahteck2@gmail.com", ahTeck.getEmail());
    }

    @Test
    void testToString() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertEquals("Author[name=Tan Ah Teck,email=ahteck@nowhere.com,gender=m]",
                ahTeck.toString());
    }
}