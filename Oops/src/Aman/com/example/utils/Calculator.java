package Oops.src.Aman.com.example.utils;

import Oops.src.Aman.com.example.geometry.Circle;
import Oops.src.Aman.com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir=new Circle(2.33);
        Rectangle rect=new Rectangle(23,24);

        double cirArea=Math.PI*Math.pow(cir.radius, 2);
        double rectArea=2* rect.length* rect.width;
        System.out.println(cirArea);
        System.out.println(rectArea);
    }
}
