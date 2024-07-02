package Array;

import java.util.Scanner;

public class freq {
    public static void frequency(int arr[],int n){
        // int freq=1;
        // int i=1;
        // if(n==1||arr[n-1]!=arr[n-2]){
        //     System.out.println(arr[n-1]+" "+1);
        // }
        // while(i<n){
        //     while(i<n&&arr[i]==arr[i-1]){
        //         freq++;
        //         i++;
        //     }
        //     System.out.println(arr[i-1]+" "+freq);
        //     i++;
        //     freq=1;
        // }
        int hash[]=new int[arr.length];
        for(int i=0;i<hash.length;i++){
            hash[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;

        }
        int q;
        Scanner sc=new Scanner(System.in);
        q=sc.nextInt();
        int i=1;
        while(i<=q){
            int number=sc.nextInt();
            System.out.print(hash[number]+" ");
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        frequency(arr,n);
    }
}
