package Array;

import java.util.Scanner;

public class delete {
    public static int[] delete(int arr[],int num){
        // int freq=0;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==num){
        //         freq++;
        //     }
        // }
        //using import function for occurences
        int occ=numofoccurences.occurences(arr, num);
        int newsize=arr.length-occ;
        int newArr[]=new int[newsize];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=num){
                newArr[j]=arr[i];
                j++;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int arr[]=Arrayutility.inputArray();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int newArr[]=delete(arr,num);
        //displaying a result array 
        // for(int i=0;i<newArr.length;i++){
        //     System.err.print(newArr[i]+" ");
        // }
        // displaying a array by importing
        Arrayutility.display(newArr);
    }
}
