package es.uah.matcomp.mp.e1.ejerciciosclases.P1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.InvoiceItem;

public class MainInvoiceItem {
    public static void main(String[] args){

        //Objeto 1
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen red", 888, 0.08);
        System.out.println (inv1);

        //Cambiar valores
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);

        //Test Getters
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        //Test getTotal()
        System.out.println("The total is: " + inv1.getTotal());
    }
}
