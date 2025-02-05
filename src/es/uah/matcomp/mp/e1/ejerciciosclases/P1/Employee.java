package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class Employee {

    //Atributos
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    //Constructor 1
    public Employee (int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        String name = firstName + " " + lastName;
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent){
        this.salary = salary + (salary*percent/100);
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ",name=" + getName() +
                ",salary=" + salary +
                ']';
    }
}
