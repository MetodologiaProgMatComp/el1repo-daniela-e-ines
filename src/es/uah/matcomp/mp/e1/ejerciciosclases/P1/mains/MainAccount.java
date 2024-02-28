package es.uah.matcomp.mp.e1.ejerciciosclases.P1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.Account;

public class MainAccount {
    public static void main(String[]args) {

         //Objeto 1: a1
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);

        //Objeto 2: a2
        Account a2 = new Account("A102", "Kumar");
        System.out.println(a2);

        //Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        //Test credit() and debit()
        a1.Credit(100);
        System.out.println(a1);

        a1.Debit(50);
        System.out.println(a1);

        a1.Debit(500);
        System.out.println(a1);     //error

        //Test transferTo()
        a1.TransferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}
