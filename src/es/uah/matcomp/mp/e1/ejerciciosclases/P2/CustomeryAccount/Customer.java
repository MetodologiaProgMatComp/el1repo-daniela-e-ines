package es.uah.matcomp.mp.e1.ejerciciosclases.P2.CustomeryAccount;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        if (gender == 'm' || gender == 'f'){
            this.gender = gender;
        } else {
            System.out.println("El género no es válido.");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + '(' + id + ')';
    }
}
