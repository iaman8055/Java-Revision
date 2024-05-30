package Array;

import java.util.Scanner;

public class numofoccurences {
    public static int occurences(int arr[],int n){
        int freq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                freq++;
            }
        }
        return freq;
    }
    public static void main(String[] args) {
        int arr[]=Arrayutility.inputArray();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int occ=occurences(arr,n);
        System.out.println(occ);
    }
}
