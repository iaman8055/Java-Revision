import java.util.Scanner;

public class primeno {
    public static boolean isPrime(int num){
        // int i=2;
        // while(i<num){
        //     if(num%i==0){
        //         return false;
        //     }
        //     i++;
        // }
        // return true;
        
        //efficient solution

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean prime=isPrime(n);
        System.out.println(prime);
    }
}
