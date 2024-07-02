package Oops.src.Aman.in.Inheritance;

public class inhertacneTest {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        twoWheeler two=new twoWheeler();
        Motorcycle mtr=new Motorcycle();
        mtr.setNumberOfWheels(5);
        mtr.commute();
        mtr.balance();
        vehicle.commute();
        two.commute();
    }

}
