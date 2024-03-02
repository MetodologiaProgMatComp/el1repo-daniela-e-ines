package es.uah.matcomp.mp.e1.ejerciciosclases.P4.Shape;

//import es.uah.matcomp.mp.e1.ejerciciosclases.P6.Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public Boolean isFilled() {
        return super.isFilled();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*length;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString()
                + ",width=" + width + ",length" + length + ']';
    }
}
