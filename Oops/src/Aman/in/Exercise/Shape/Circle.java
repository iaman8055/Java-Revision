package Oops.src.Aman.in.Exercise.Shape;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
         double area=Math.PI*Math.pow(radius,2);
         System.out.println(area);
    }
}
