package Array;

import java.util.Scanner;

public class Arrayutility {
    public static int[] inputArray() {
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    } 
    public static void display(int[] numArray){
        for(int i=0;i<numArray.length;i++){
            System.err.print(numArray[i]+" ");
        }
        System.out.println();
    }
}
