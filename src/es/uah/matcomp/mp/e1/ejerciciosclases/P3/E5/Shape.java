package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5;

public class Shape {

    private String color = "red";
    private boolean filled = true;

    public Shape() {}

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }


    @Override
    public String toString() {
        return "Shape[" +
                "color=" + color +
                ",filled=" + filled +
                ']';
    }
}
