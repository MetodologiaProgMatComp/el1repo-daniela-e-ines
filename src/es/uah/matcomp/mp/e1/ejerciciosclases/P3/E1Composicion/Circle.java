package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1Composicion;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){            //Constructor por defecto
        //Inicializacion por defecto
    }
    public Circle (double radius){
        this.radius = radius;
    }
    public Circle (double radius, String color){        //Constructor con parametros
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return (radius*radius*Math.PI);
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
}
