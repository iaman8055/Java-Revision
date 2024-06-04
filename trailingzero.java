
import java.util.Scanner;

public class trailingzero {
    public static int factorial(int n){
        
        return fact;
    }
    public static int trailing(int num){
        int fact=1;
               int i=1;
        while(i<=num){
            fact*=i;
            i++;
        }
        int count=0;
        while(fact%10==0){
            count++;
            fact=fact/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int trail=trailing(n);

    System.out.println(trail);
    }
    
}
