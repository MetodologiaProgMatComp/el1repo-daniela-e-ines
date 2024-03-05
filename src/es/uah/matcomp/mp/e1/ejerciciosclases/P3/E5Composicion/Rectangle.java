package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5Composicion;

public class Rectangle extends Shape {

    private Shape shape;
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {this.shape = new Shape(); }

    public Rectangle(double width, double length) {
        this.shape = new Shape();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.shape = new Shape(color, filled);
        this.width = width;
        this.length = length;
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


    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2*width + 2*length;
    }

    @Override
    public String toString() {
        return "Rectangle[" + shape.toString()
                + ",width=" + width + ",length" + length + ']';
    }
}
