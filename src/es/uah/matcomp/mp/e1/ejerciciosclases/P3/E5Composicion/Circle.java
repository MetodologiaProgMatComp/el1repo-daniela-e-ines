package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5.Shape;

public class Circle extends Shape {
    private Shape shape;
    protected double radius = 1.0;

    public Circle() {this.shape = new Shape();}
    public Circle(double radius) {
        this.shape = new Shape();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.shape = new Shape(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + shape.toString() + ",radius=" + radius + ']';
    }
}
