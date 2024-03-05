package es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{x, y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + ',' + y + ")";
    }

    public double distance (int x, int y){
        return +Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
    }

    public double distance (MyPoint another){
        return +Math.sqrt(Math.pow(another.x-this.x,2)+Math.pow(another.y-this.y,2));
    }

    public double distance(){
        return +Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
}
