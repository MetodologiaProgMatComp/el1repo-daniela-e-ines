package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E4Composicion;

import es.uah.matcomp.mp.e1.ejerciciosclases.P3.E4Composicion.Point;

public class MovablePoint extends Point {
    private Point point;
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        this.point = new Point(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.point = new Point();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {this.point = new Point();}

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] resultado = new float[2];
        resultado[0] = xSpeed;
        resultado[1] = ySpeed;
        return resultado;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return point.toString() + "speed=(" + xSpeed + ',' + ySpeed + ')';
    }

    public MovablePoint move() {
        float newX = point.getX() + xSpeed;
        float newY = point.getY() + ySpeed;
        point.setXY(newX,newY);
        return this;
    }
}

