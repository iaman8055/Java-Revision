
import Array.Arrayutility;


public class lastocc {
    public static void lastocc(int arr[],int x){
        int low=0;
        int high=arr.length;
        while(low<=high){
            int mid=low+high/2;

            if(arr[mid]<x){
                high=mid-1;
            }else if(arr[mid]>x){
                low=mid+1;
            }else{
                if(mid!=arr.length-1||arr[mid]!=arr[mid+1]){
                    System.out.print(mid);
                    break;
                }else{
                    low=mid+1;
                }
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        int arr[]=Arrayutility.inputArray();
        Scanner sc=new Scanner(System.in);
        lastocc(arr,x);
    }
}
