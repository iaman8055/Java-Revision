
import java.util.Scanner;

public class lcmofnum {
    public static int lcm(int first,int second){
        // int i=1;
        // while(i<=second){
        //     int factor=first*i;
        //     if(factor%second==0){
        //         return factor;
        //     }
        //     i++;
        // }
        // return 0;

        int i=0;
        while(i<=second){
            if(first%i==0&&second%i==0){
                i*=i;
            }
            else{
                
            }
        }

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
       int lcm= lcm(first,second);
       System.out.println(lcm);
    }
}
