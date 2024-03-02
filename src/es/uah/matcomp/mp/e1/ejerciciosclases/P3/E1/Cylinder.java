package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E1;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        height = 2.0;
    }
    public Cylinder (double height){
        super();
        this.height = height;
    }
    public Cylinder (double radius, double height){
        super (radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return (2*Math.PI*getRadius()*height+2*super.getArea());
    }

    public double getVolume(){
        double area = super.getArea();
        return (area*height);
    }
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}
