package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class Rectangle {

    //Atributos
    private float length;
    private float width;

    //Constructor 1
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    //Constructor 2
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    //Getters y Setters
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return length*2+width*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
