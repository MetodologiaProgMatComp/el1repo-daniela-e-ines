package es.uah.matcomp.mp.e1.ejerciciosclases.P2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        assertEquals("more Java", anotherBook.getName());
    }

    @Test
    void getAuthor() {
        Author authorej = new Author("Paul Tan", "paul@somewhere.com", 'm');
        Book anotherBook = new Book("more Java",authorej, 29.95);
        assertEquals(authorej,anotherBook.getAuthor());
    }

    @Test
    void getPrice() {
        Author authorej = new Author("Paul Tan", "paul@somewhere.com", 'm');
        Book anotherBook = new Book("more Java", authorej, 29.95);
        assertEquals(29.95,anotherBook.getPrice());
    }

    @Test
    void getQty() {
        Author authorej = new Author("Paul Tan", "paul@somewhere.com", 'm');
        Book anotherBook = new Book("more Java", authorej, 29.95);
        assertEquals(0,anotherBook.getQty());
    }

    @Test
    void setPrice() {
        Author authorej = new Author("Paul Tan", "paul@somewhere.com", 'm');
        Book anotherBook = new Book("more Java", authorej, 29.95);
        assertDoesNotThrow(()->anotherBook.setPrice(35.00));
        assertEquals(35.00,anotherBook.getPrice());
    }

    @Test
    void setQty() {
        Author authorej = new Author("Paul Tan", "paul@somewhere.com", 'm');
        Book anotherBook = new Book("more Java", authorej, 29.95);
        assertDoesNotThrow(()->anotherBook.setQty(35));
        assertEquals(35,anotherBook.getQty());
    }

    @Test
    void getAuthorName() {
        Author authorej = new Author("Paul Tan", "paul@somewhere.com", 'm');
        Book anotherBook = new Book("more Java", authorej, 29.95);
        assertEquals("Paul Tan", anotherBook.getAuthorName());
    }

    @Test
    void getAuthorEmail() {
        Author authorej = new Author("Paul Tan", "paul@somewhere.com", 'm');
        Book anotherBook = new Book("more Java", authorej, 29.95);
        assertEquals("paul@somewhere.com", anotherBook.getAuthorEmail());
    }

    @Test
    void getAuthorGender() {
        Author authorej = new Author("Paul Tan", "paul@somewhere.com", 'm');
        Book anotherBook = new Book("more Java", authorej, 29.95);
        assertEquals('m', anotherBook.getAuthorGender());
    }

    @Test
    void testToString() {
        Author authorej = new Author("Paul Tan", "paul@somewhere.com", 'm');
        Book anotherBook = new Book("more Java", authorej, 29.95);
        assertEquals("Book[name=more Java,author=Author[name=Paul Tan,email=paul@somewhere.com,gender=m],price=29.95,qty=0]", anotherBook.toString());
    }
}