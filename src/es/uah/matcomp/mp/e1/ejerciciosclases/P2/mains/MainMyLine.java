package es.uah.matcomp.mp.e1.ejerciciosclases.P2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point.MyLine;
import es.uah.matcomp.mp.e1.ejerciciosclases.P2.Point.MyPoint;

import java.util.Arrays;

public class MainMyLine {
    public static void main(String[]args){
        MyLine l1 = new MyLine(1,1,4,4);
        System.out.println(l1);

        System.out.println(l1.getBegin());
        System.out.println(l1.getEnd());
        l1.setBegin(new MyPoint(4,5));
        l1.setEnd(new MyPoint(6,7));
        System.out.println(l1);

        System.out.println("Lenght=" + l1.getLength());
        System.out.println("Gradient=" + l1.getGradient());

        MyLine l2 = new MyLine(new MyPoint(2,3), new MyPoint(3,6));
        System.out.println(l2);

        System.out.println("Begin x=" + l2.getBeginX() + ", Begin y=" + l2.getBeginY());
        System.out.println("End x=" + l2.getEndX() + ", End y=" + l2.getEndY());
        System.out.println("Begin XY= " + Arrays.toString(l2.getBeginXY()) + "End XY=" + Arrays.toString(l2.getEndXY()));

        l2.setBeginXY(0,0);
        l2.setEndXY(4,4);
        System.out.println(l2);
        l2.setBeginX(3);
        l2.setBeginY(5);
        l2.setEndX(1);
        l2.setEndY(-1);
        System.out.println(l2);
    }
}
