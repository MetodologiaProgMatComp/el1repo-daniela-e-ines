package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6Composicion.Animal;

public class Mammal {

    private Animal animal;
    public Mammal(String name) {
       this.animal = new Animal(name);
    }

    public String toString() {
        return "Mamal[" + animal.toString() + ']';
    }
}
