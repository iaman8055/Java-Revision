package Array;

import java.util.Scanner;

public class leader {
    public static void Leader(int arr[],int n){
        //naive approach

        for(int i=0;i<n;i++){
            boolean flag=false;

            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(arr[i]);
            }
        }
        // int curr_ldr=arr[n-1];
        // System.out.print(curr_ldr+" ");
        // for(int i=n-2;i>=0;i--){
        //     if(curr_ldr<arr[i]){
        //         curr_ldr=arr[i];
        //         System.out.print(curr_ldr+" ");
        //     }
        // }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    }
}
