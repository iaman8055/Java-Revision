

import java.util.Scanner;



public class firstOcc {
    public static void firstocc(int[] arr,int x) {
          int s=0;
          int e=arr.length;
          while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]<x){
                s=mid+1;
            }else if(arr[mid]>x){
                e=mid-1;
            }else{
                if(mid==0||arr[mid]!=arr[mid-1]){
                System.out.print(mid);
                break;
            }else {
                e=mid-1;
            }
            
            }
            
          }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        firstocc(arr,x);
    }
}
