package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Employee {
    //Definir variables, privadas
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private String name;

    //Constructores
    public Employee (int i, String fN, String lN, int s){
        this.id = i;
        this.firstName = fN;
        this.lastName = lN;
        this.salary = s;
        this.name = fN + " " + lN;
    }

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
        return firstName + " " + lastName;
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
        return salary + salary*percent/100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name= " + name +
                ", salary=" + salary +
                '}';
    }
}
