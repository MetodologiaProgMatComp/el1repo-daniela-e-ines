package es.uah.matcomp.mp.e1.ejerciciosclases.P2.AuthoryBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("Tan Ah Teck", ahTeck.getName());
    }

    @Test
    void getEmail() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("ahteck@nowhere.com", ahTeck.getEmail());
    }

    @Test
    void setEmail() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertDoesNotThrow(()-> ahTeck.setEmail("ahteck2@gmail.com"));
        assertEquals("ahteck2@gmail.com", ahTeck.getEmail());
    }

    @Test
    void testToString() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("Author[name=Tan Ah Teck,email=ahteck@nowhere.com]",
                ahTeck.toString());
    }
}