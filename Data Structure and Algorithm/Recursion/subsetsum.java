import java.util.Scanner;

public class subsetsum {
    public static int gensum(int i,int arr[],int sum,int n){
        if(i==n){
            return (sum==0)?1:0;
        }
        return gensum(i+1,arr,sum,n)+gensum(i+1,arr,sum-arr[i],n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
       int count= gensum(0,arr,sum,n);
       System.out.println(count);
    }
}
