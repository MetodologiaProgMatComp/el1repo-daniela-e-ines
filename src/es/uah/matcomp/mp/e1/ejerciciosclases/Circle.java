package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle {
    private double radio;

    public Circle(){
        this.radio = 1;
    }

    public Circle (double r){
        this.radio = r;
    }

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
