package es.uah.matcomp.mp.e1.ejerciciosclases.P1.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.Employee;

public class MainEmployee {
    public static void main (String[]args){

        //Objeto 1: e1
        Employee e1 = new Employee (8, "Peter", "Tan", 2500);
        System.out.println(e1);

        //Cambiar valor salary
        e1.setSalary(999);

        //Test getters
        System.out.println(e1);
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}
