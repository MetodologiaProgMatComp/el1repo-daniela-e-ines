package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E3;

import java.util.Arrays;

public class Point3D extends Point2D{
    float z = 0.0f;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] xyz = new float[3];
        xyz = new float[]{super.getX(), super.getY(), z};
        return xyz;
    }
    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
