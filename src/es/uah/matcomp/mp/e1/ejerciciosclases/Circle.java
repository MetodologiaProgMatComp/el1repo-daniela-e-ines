package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle {

    //Atributos
    private double radio;

    //Constructor 1
    public Circle(){
        this.radio = 1;
    }

    //Constructor 2
    public Circle (double r){
        this.radio = r;
    }

    //Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea(){
        return radio*radio*Math.PI;
    }

    public double getCircunference(){
        return 2*radio*Math.PI;
    }

    public String toString(){
        return "Circle [radius = " + radio + "]";
    }
}
