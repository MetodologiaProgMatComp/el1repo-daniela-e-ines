package es.uah.matcomp.mp.e1.ejerciciosclases.P4.Animal;

public class BigDog extends Dog{
    @Override
    public void greets() {
        System.out.println("Woooow!");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooooww");;
    }
}
