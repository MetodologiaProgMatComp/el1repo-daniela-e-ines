package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E5Composicion;

public class Square extends Rectangle{
    private Rectangle rect;
    public Square() {this.rect = new Rectangle();}

    public Square(double side) {
        this.rect = new Rectangle(side, side);
    }

    public Square(double side, String color, boolean filled) {
        this.rect = new Rectangle(side, side, color, filled);
    }

    public double getSide() {
        return rect.getWidth();
    }


    public void setSide(double side) {
        rect.setLength(side);
        rect.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        rect.setWidth(width);
        rect.setLength(width);
    }

    @Override
    public void setLength(double length) {
        rect.setLength(length);
        rect.setWidth(length);
    }

    @Override
    public String toString() {
        return "Square[" + rect.toString() + ']';
    }
}
