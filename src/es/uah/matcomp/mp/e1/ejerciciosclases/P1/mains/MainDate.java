package es.uah.matcomp.mp.e1.ejerciciosclases.P1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.Date;

public class MainDate {
    public static void main (String[]args){

        //Objeto 1: d1
        Date d1 = new Date (1, 2, 2014);
        System.out.println(d1);

        //Test Getters y Setters
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);
        System.out.println(("Month: " + d1.getMonth()));
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());

        d1.setDate(3, 4, 2016);
        System.out.println(d1);
    }
}
