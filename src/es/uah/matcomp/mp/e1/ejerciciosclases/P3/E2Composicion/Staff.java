package es.uah.matcomp.mp.e1.ejerciciosclases.P3.E2Composicion;

public class Staff {
    private Person person;
    private String school;
    private double pay;
    public Staff (String name, String address, String school, double pay){
        this.person = new Person (name, address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString (){
        return "Staff composition of Person:[" + person.toString() + ", school= " + school +
                ", pay=" + pay + ']';
    }
}
