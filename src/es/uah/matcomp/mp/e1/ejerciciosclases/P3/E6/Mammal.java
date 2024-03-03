package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6.Animal;

public class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }

    public String toString() {
        return "Mamal[" + super.toString() + ']';
    }
}
