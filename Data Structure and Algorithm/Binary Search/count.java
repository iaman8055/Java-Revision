import java.util.Scanner;

public class count {
    public static void freqof1(int arr[],int n){
       int s=0;;int e=n-1;
       int x=1;
    //    firstOcc.firstocc(arr, x);
    //    lastocc.lastocc(arr, x);
    //    firstOcc.firstocc(arr, x);
    //    if(==-1) {
    //     System.out.print(0);
    //    }
    //    else{
    //     int count=last-first+1;
    //     System.err.println(count);
    //    }
    while(s<=e){
        int mid=s+e/2;
        if(arr[mid]==0){
            s=mid+1;
        }else {
            if(mid==0||arr[mid-1]==0){
                System.out.println(n-mid);;
            }else{
                e=mid-1;
            }
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        freqof1(arr,n);
    }
}
