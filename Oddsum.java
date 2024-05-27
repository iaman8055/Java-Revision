
import java.util.Scanner;

public class Oddsum {
    public static void main(String [] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%2==1){
                sum+=i;
            }
            i++;

        }
        System.out.println(sum);
    }
    
}
