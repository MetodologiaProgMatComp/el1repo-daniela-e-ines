package es.uah.matcomp.mp.e1.ejerciciosclases.P4.mains;
import es.uah.matcomp.mp.e1.ejerciciosclases.P4.Animal.Animal;
import es.uah.matcomp.mp.e1.ejerciciosclases.P4.Animal.Cat;
import es.uah.matcomp.mp.e1.ejerciciosclases.P4.Animal.Dog;
import es.uah.matcomp.mp.e1.ejerciciosclases.P4.Animal.BigDog;

public class MainAnimalCatDog {
    public static void main (String []args) {
        Cat cat1 = new Cat();
        cat1.greets();

        Dog dog1 = new Dog();
        dog1.greets();

        BigDog bigdog1 = new BigDog();
        bigdog1.greets();

        Animal animal1 = new Cat();
        animal1.greets();
        Animal animal2 = new Dog();
        animal2.greets();
        Animal animal3 = new BigDog();
        animal3.greets();

        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        Cat cat2 = (Cat)animal2;
        cat2.greets();
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigdog1);
    }
}
