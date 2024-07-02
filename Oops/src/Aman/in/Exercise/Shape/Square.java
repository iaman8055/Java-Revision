package Oops.src.Aman.in.Exercise.Shape;

public class Square extends Shape{
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea(){
        double area=Math.pow(side,2);
        System.out.println(area);
    }
}
