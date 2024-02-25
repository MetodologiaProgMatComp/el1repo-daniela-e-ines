package es.uah.matcomp.mp.e1.ejerciciosclases;

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
        this.second += 1;
        if (second == 60) {
            this.minute += 1;
            this.second = 0;
            if (minute == 60) {
                this.hour +=1;
                this.minute = 0;
                if (hour==24){
                    this.hour = 0;
                }
            }
        }
        return new Time (hour, minute, second);
    }

    public Time previousSecond(){
        this.second -= 1;
        if (second<0){
            this.second = 59;
            this.minute -=1;
            if (minute<0){
                this.minute = 59;
                this.hour -=1;
                if (hour<0){
                    this.hour=23;
                }
            }
        }
        return new Time (hour, minute, second);
    }
}
