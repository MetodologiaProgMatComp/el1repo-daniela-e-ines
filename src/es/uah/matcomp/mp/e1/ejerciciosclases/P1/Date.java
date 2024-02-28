package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class Date {

    //Atributos
    private int day;
    private int month;
    private int year;

    //Constructor 1
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Getters y Setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d",day) +          //%02d: dos cifras
                "/" + String.format("%02d",month) +
                "/" + year;
    }
}
