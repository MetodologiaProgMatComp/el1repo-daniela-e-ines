package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2Composicion;

public class Student {
    private Person person;
    private String program;
    private int year;
    private double fee;
    public Student (String name, String address, String program, int year, double fee){
        this.person = new Person (name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString(){
        return "Studen composition of Person: [" + person.toString() + ", program= " + program + ", year= " + year + ", fee= " + fee + "]";}
}
