package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E6;

public class MainAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal("Leo");
        System.out.println(a1);

        Mammal m1 = new Mammal("Simba");
        System.out.println(m1);

        Cat c1 = new Cat("Pepa");
        System.out.println(c1);
        c1.greets();

        Dog d1 = new Dog("Calcetines");
        Dog d2 = new Dog("Zapatos");
        System.out.println(d1);
        d1.greets();
        System.out.println(d2);
        d1.greets(d2);
        //No puedo hacer una llamada a greets() de un animal, ya que ese método no
        //está definido en Animal, y las clases hijas pueden heredar métodos, pero las
        //clases padre no.
    }
}
