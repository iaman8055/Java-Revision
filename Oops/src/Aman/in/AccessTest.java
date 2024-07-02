package Oops.src.Aman.in;

public class AccessTest {
    public static void main(String[] args) {
        Car car=new Car();
        car.color="Blue";
        car.model="gt800";

        System.out.println(car);
        Car mycar=new Car("Black","Rs200",1,200);
        System.out.println(mycar);
        
    }
}
