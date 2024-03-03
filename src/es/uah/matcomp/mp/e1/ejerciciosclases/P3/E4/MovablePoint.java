package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E4;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {}

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
        return super.toString() + "speed=(" + xSpeed + ',' + ySpeed + ')';
    }

    public MovablePoint move() {
        float newX = getX() + xSpeed;
        float newY = getY() + ySpeed;
        setXY(newX,newY);
        return this;
    }
}
