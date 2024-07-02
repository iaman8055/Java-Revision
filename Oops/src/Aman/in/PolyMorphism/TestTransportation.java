package Oops.src.Aman.in.PolyMorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c=new Car();
       // Vehicle v=new Vehicle();
        Plane p=new Plane();
//        Vehicle v1=new Car();
//        Car c1=(Car) new Vehicle();
//        casttest(v);
        casttest(c);
        casttest(p);
    }
    private static void casttest(Vehicle veh){
//        Car cVehicle=(Car) veh;
//        ((Car) veh).noOfDoors();
//        cVehicle.start();
//        cVehicle.noOfDoors();
//        Plane pVehicle=(Plane) veh;
//        veh.start();
//        pVehicle.start();
//        System.out.println(pVehicle.noOfSeats());
        veh.start();

    }
}

