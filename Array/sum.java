package Array;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int [] numarray=Arrayutility.inputArray();
        int sum=sumarray(numarray);
        int avg=avg(numarray);
        System.err.println(sum+" "+avg);
    }
    public static int sumarray(int numarray[]){
        int sum=0;
        for(int i=0;i<numarray.length;i++){
            sum+=numarray[i];
        }

        return sum;
    }
    public static int avg(int numarray[]){
        int sum=0;
        for(int i=0;i<numarray.length;i++){
            sum+=numarray[i];
        }

        return sum/numarray.length;
    }

}
