package es.uah.matcomp.mp.e1.ejerciciosclases.P2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Book2Test {

    @Test
    void getName() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        assertEquals("Java for Dummy", javaDummy.getName());
    }

    @Test
    void getAuthors() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        assertEquals(authors, javaDummy.getAuthors());
    }

    @Test
    void getPrice() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        assertEquals(19.99,javaDummy.getPrice());
    }

    @Test
    void getQty() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        assertEquals(99, javaDummy.getQty());
    }

    @Test
    void setPrice() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        assertDoesNotThrow(()->javaDummy.setPrice(30));
        assertEquals(30,javaDummy.getPrice());
    }

    @Test
    void setQty() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        assertDoesNotThrow(()->javaDummy.setQty(100));
        assertEquals(100,javaDummy.getQty());
    }

    @Test
    void getAuthorNames() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        assertEquals("Tan Ah Teck, Paul Tan", javaDummy.getAuthorNames());
    }

    @Test
    void testToString() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        assertEquals("Book[name=Java for Dummy,authors={Author[name=Tan Ah Teck,email=AhTeck@somewhere.com,gender=m], Author[name=Paul Tan,email=Paul@nowhere.com,gender=m]},price=19.99,qty=99]", javaDummy.toString());
    }
}