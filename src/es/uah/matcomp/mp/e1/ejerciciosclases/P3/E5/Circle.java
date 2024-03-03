package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5;

public class Circle extends Shape{
    protected double radius = 1.0;

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
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
        return "Circle[" + super.toString() + ",radius=" + radius + ']';
    }
}
