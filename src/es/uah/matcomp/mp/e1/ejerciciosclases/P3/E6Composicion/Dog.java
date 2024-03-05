package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6Composicion.Mammal;

public class Dog {
    private Mammal mammal;
    public Dog(String name) {
        this.mammal = new Mammal(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    public String toString() {
        return "Dog[" + mammal.toString() +']';
    }
}
