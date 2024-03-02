package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2.Person;

public class mainPerson {
    public static void main(String[]args){
        Person p1 = new Person("Lucia", "C/Cifuentes");
        System.out.println(p1);

        System.out.println("name: " + p1.getName());
        System.out.println("address: " + p1.getAddress());
        p1.setAddress("C/Brihuega");
        System.out.println("new address: " + p1.getAddress());
    }
}
