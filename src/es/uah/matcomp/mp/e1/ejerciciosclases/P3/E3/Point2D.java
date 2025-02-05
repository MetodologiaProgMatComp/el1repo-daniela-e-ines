package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E3;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] xy = new float [2];
        xy = new float[]{x, y};
        return xy;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }
}
