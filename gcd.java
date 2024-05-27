import java.util.Scanner;

public class gcd {
    public static int gcdofnum(int first,int second){
        int i=1;
        int max=Integer.MIN_VALUE;
        while(i<=first){
            if(first%i==0 &&second%i==0){
                if(max<i){
                    max=i;
                }
            }
            i++;
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        int gcd=gcdofnum(first,second);
        System.out.println(gcd);
    }
}
