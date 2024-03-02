package es.uah.matcomp.mp.e1.ejerciciosclases.P2.AuthoryBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("12345", b1.getIsbn());
    }

    @Test
    void getName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Java for dummies", b1.getName());
    }

    @Test
    void getAuthor() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals(a1, b1.getAuthor());
    }

    @Test
    void getPrice() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals(8.8, b1.getPrice());
    }

    @Test
    void getQty() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals(88, b1.getQty());
    }

    @Test
    void setPrice() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertDoesNotThrow(()->b1.setPrice(30));
        assertEquals(30, b1.getPrice());
    }

    @Test
    void setQty() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertDoesNotThrow(()->b1.setQty(100));
        assertEquals(100, b1.getQty());
    }

    @Test
    void getAuthorName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Tan Ah Teck", b1.getAuthorName());
    }

    @Test
    void testToString() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Book[isbn=12345,name=Java for dummies,Author[name=Tan Ah Teck,email=ahteck@nowhere.com],price=8.8,qty=88]", b1.toString());
    }
}