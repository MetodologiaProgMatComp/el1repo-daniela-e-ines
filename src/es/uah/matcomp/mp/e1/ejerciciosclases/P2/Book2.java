package es.uah.matcomp.mp.e1.ejerciciosclases.P2;

//import es.uah.matcomp.mp.e1.ejerciciosclases.P2.Author;

public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book2(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book2(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){ return name;}

    public Author[] getAuthor() {return authors;}

    public double getPrice() {return price;}

    public int getQty() {return qty;}

    public void setPrice(double price) {this.price = price;}

    public void setQty(int qty) {this.qty = qty;}

    //public String getAuthorName(){
    //    return authors.getName();
    //}


    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();

        for (Author author : authors) {
            authorNames.append(author.getName()).append(", ");
        }

        // Eliminar la coma y el espacio extra al final si hay autores
        if (authorNames.length() > 0) {
            authorNames.delete(authorNames.length() - 2, authorNames.length());
        }

        return authorNames.toString();
    }


    //public String getAuthorEmail(){
    //    return authors.getEmail();
    //}

    //public char getAuthorGender(){
    //    return author.getGender();
    //}

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Book[name=" + name + ",authors={");

        for (Author author : authors) {
            result.append(author.toString()).append(", ");
        }

        // Eliminar la coma y el espacio extra al final si hay autores
        if (authors.length > 0) {
            result.delete(result.length() - 2, result.length());
        }

        result.append("},price=" + price + ",qty=" + qty + "]");

        return result.toString();
    }
}
