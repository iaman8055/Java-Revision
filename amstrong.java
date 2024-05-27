import java.util.Scanner;

public class amstrong {
    public static boolean isamstrong(int n){
        int original_num=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }
        if(sum==original_num)return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean amstrong=isamstrong(n);
        System.out.println(amstrong);
    }
}
