package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import java.text.DecimalFormat;

public class Time {

    //Atributos
    private int hour;
    private int minute;
    private int second;

    //Constructor 1
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Getters y Setters
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d", hour) + ":" +
                String.format("%02d", minute) + ":" +
                String.format("%02d", second);
    }

    public Time nextSecond(){
        this.second ++;
        if (second == 60) {
            this.second = 0;
            this.minute ++;
            if (minute == 60) {
                this.minute = 0;
                this.hour = (hour + 1) % 24;
            }

        }
        return new Time (hour, minute, second);
    }

    public Time previousSecond(){
        this.second --;
        if (second<0){
            this.second = 59;
            this.minute --;
            if (minute<0){
                this.minute = 59;
                this.hour = (hour - 1 + 24) % 24;
            }
        }
        return new Time (hour, minute, second);
    }
}
