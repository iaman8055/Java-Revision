package Array;

public class isSorted {
    public static boolean isInc(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){

                return false;
            }
        }
        return true;
    }
    public static boolean isDec(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                return false;
            }

        }
        return true;
    }
    
    public static void main(String[] args) {
        int arr[]=Arrayutility.inputArray();
        boolean inc=isInc(arr);
        boolean dec=isDec(arr);
        if(inc||dec){
            System.err.println("Array is Sorted");
        }
        else System.err.println("Array is not sorted");
    }
   
}
