
import java.util.Scanner;

public class sqroot {
    public static void root(int x){
        int low=1;
        int high=x;
        int ans=-1;
        while(low<=high){
            int mid=low+high/2;
            int sq=mid*mid;
            if(sq==x){
                ans=mid;
                break;
            }else if(sq<x){
                low=mid+1;

            }else {
                high=mid-1;
            }

        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        root(x);
    }
}
