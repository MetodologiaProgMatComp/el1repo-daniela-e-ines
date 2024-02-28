package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("A101",inv1.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("Pen Red",inv1.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(888,inv1.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertDoesNotThrow(()->inv1.setQty(999));
        assertEquals(999,inv1.getQty());
    }

    @Test
    void getUnitPrice() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(0.08,inv1.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertDoesNotThrow(()->inv1.setUnitPrice(1.12));
        assertEquals(1.12,inv1.getUnitPrice());
    }

    @Test
    void getTotal() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals(71.04,inv1.getTotal());
    }

    @Test
    void testToString() {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        assertEquals("InvoiceItem[id=A101,desc=Pen Red,qty=888,unitPrice=0.08]",inv1.toString());
    }
}