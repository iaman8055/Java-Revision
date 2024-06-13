import java.util.Scanner;

public class sumofdigit {
    public static int sum(int num){
        if(num==0) return 0;
        int sum=0;
        sum+=num%10;
        return sum+sum(num/10);
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=sum(num);
        System.out.println(result);
    }
}
