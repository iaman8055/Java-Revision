package Oops.src.Aman.in;

public class Car {
    public String color;
    public String model;
    private double fuellevel;
    private double costofpurchase;
    public Car(){

    }
    
    public Car(String color, String model, double costofpurchase, double fuellevel) {
        this.color = color;
        this.model = model;
        this.costofpurchase = costofpurchase;
        this.fuellevel = fuellevel;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                ", model='" + model + '\'' +
//                ", fuellevel=" + fuellevel +
//                ", costofpurchase=" + costofpurchase +
//                '}';
//    }
}
