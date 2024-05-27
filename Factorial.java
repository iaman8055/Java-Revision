
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int fact=1;
               int i=1;
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.println(fact);
    }
    
}
