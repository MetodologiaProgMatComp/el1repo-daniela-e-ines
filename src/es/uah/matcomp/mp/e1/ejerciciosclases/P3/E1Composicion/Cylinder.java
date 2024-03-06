package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1Composicion;

public class Cylinder {
    private Circle circle;
    private double height;
    public Cylinder(){
        this.circle = new Circle();
        this.height = 2.0;
    }
    public Cylinder(double height){
        this.circle = new Circle();
        this.height = height;
    }
    public Cylinder (double radius, double height){
        this.circle = new Circle(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        this.circle = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return (2*Math.PI*circle.getRadius()*height+2*circle.getArea());
    }

    public double getVolume(){
        double area = circle.getArea();
        return (area*height);
    }
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder composition of Circle:[radius=" + circle.getRadius() +
                ", color=" + circle.getColor() +
                ", height = " + height + "]";
    }
}
