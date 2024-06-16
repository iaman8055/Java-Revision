
import Array.Arrayutility;

public class flips{
    public static void minflips(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0]){
                    System.err.print("flips from "+i+" to");
                }else{
                    System.err.println(i-1);

                }
            }
            if(arr[arr.length-1]!=arr[0]){
                System.err.println(arr.length-1);

            }
        }
    }
    public static void main(String[] args) {
        int arr[]=Arrayutility.inputArray();
        minflips(arr);
    }
}