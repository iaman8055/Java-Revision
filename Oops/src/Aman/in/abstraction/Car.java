package Oops.src.Aman.in.abstraction;

public  class Car extends Vehicle{
    private int noOfDoors;
    public Car() {
        super(4);
    }

    @Override
    public void makestartsound() {
        System.out.println("v");
    }

//    @Override
//    public void noOfCars() {
//
//    }
}
