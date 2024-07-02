package Oops.src.Aman.in.Inheritance;

public class Vehicle {
    private int numberOfWheels;
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels=numberOfWheels;
    }
    public void commute(){
        System.out.printf("I am going from place A to place B using %d tires ",numberOfWheels);
    }
}
