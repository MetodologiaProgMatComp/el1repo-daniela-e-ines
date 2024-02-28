package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class Account {

    //Atributos
    private String id;
    private String name;
    private int balance = 0;

    //Constructor 1
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //Constructor 2
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Getters y Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int Credit(int amount){
        this.balance = balance + amount;
        return balance;
    }

    public int Debit(int amount){
        if (amount<=balance){
            this.balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int TransferTo (Account another, int amount){
        if (amount<=balance){
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
