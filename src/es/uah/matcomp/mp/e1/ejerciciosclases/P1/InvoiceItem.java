package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class InvoiceItem {

    //Atributos
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    //Constructor 1
    public InvoiceItem (String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    //Getters y Setters
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return unitPrice*qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem[" +
                "id=" + id +
                ",desc=" + desc +
                ",qty=" + qty +
                ",unitPrice=" + unitPrice +
                ']';
    }
}
