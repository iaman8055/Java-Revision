import java.util.Scanner;

public class palindrome {

    public static boolean ispalindrome(int original,int rev){
       return original==rev;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int original=n;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        boolean palindrome=ispalindrome(original,rev);
        System.out.println(palindrome);
    }
}
