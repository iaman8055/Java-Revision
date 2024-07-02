package Oops.src.Aman.in.PolyMorphism;

public class Car implements Vehicle{

    public int noOfDoors(){
        return 5;
    }

    @Override
    public void start() {
        System.out.println("car is starting");
    }
}
