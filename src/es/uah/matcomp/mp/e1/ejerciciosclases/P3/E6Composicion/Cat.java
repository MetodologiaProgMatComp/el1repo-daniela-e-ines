package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6Composicion.Mammal;

public class Cat {

    private Mammal mammal;
    public Cat(String name) {
        this.mammal = new Mammal(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    public String toString() {
        return "Cat[" + mammal.toString() + ']';
    }
}
