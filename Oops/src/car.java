package Oops.src;

public class car {
    //instance variables 
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfseats;
    int fuel;

    car(){
        noOfseats=4;
        color="blue";
        maxSpeed=120;
    }
//instance methods
    public void drive(){
        System.out.println("car is driving");
        currentFuelInLiters--;
    }
    public void addFuel(int fuel){
        currentFuelInLiters+=fuel;
    }
    public float getCurrentFuelLevel(){
        if(currentFuelInLiters==0){
            System.out.println("Car is out of fuel");
        }
        if(currentFuelInLiters<5) System.out.println("car is in reserved mode,please refuel");
        return currentFuelInLiters;
    }
    public static void main(String[] args) {
        car mycar=new car();
        mycar.addFuel(6);
        mycar.drive();
        mycar.drive();
        mycar.drive();
        System.out.println(mycar.getCurrentFuelLevel());

    }
}
