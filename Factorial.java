
import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        int fact=1;
               int i=1;
        while(i<=n){
            fact*=i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }
    
}
