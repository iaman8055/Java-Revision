package Oops.src.Aman.gettersetter;

public class Car {
    private String color;
    private String model;
    private double fuellevel;
    private double costofpurchase;
    public  Car(){

    }
    public Car(String color, String model, double fuellevel, double costofpurchase) {
        this.color = color;
        this.model = model;
        this.fuellevel = fuellevel;
        this.costofpurchase = costofpurchase;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getCostofpurchase() {
        return costofpurchase;
    }

    public double getFuellevel() {
        return fuellevel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuellevel(double fuellevel) {
        this.fuellevel = fuellevel;
    }

    public void setCostofpurchase(double costofpurchase) {
        this.costofpurchase = costofpurchase;
    }
}
