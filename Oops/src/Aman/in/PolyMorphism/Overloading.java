package Oops.src.Aman.in.PolyMorphism;

public class Overloading {

    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public String sum(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        System.out.println(overloading.sum(3,4));
        System.out.println(overloading.sum("1","45"));
    }
}
