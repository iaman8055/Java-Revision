package Oops.src.Aman.in.PolyMorphism;

public class Plane implements Vehicle {
    public void start(){
        System.out.println("Plane is taking off...");
    }
    public int noOfSeats(){
        return 300;
    }
}
