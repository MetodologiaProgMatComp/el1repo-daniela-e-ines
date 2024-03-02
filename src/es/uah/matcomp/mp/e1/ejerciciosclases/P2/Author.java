package es.uah.matcomp.mp.e1.ejerciciosclases.P2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name,String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'm' || gender == 'f'){
            this.gender = gender;
        } else {
            System.out.println("El género no es válido.");
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Author[name=" + name +
                ",email=" + email +
                ",gender=" + gender + "]";
    }

}
