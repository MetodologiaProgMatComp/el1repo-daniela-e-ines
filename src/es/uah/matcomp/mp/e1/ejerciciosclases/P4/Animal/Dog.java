package es.uah.matcomp.mp.e1.ejerciciosclases.P4.Animal;

public class Dog extends Animal{
    @Override
    public void greets() {
        System.out.println("Woof!");
    }

    public void greets (Dog another){
        System.out.println("Wooooof");
    }
}
