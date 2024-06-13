import java.util.Scanner;

public class Palin {
    public static boolean ispalindrome(String str,int start,int end){
        if(start>=end)return true;
        return (str.charAt(start)==str.charAt(end))&& ispalindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int start=0;
        int end=str.length()-1;
        boolean palindrome=ispalindrome(str,start,end);
        System.out.println(palindrome);
    }    
}

