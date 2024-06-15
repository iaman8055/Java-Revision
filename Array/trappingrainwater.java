package Array;

public class trappingrainwater {
    public static void getWater(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int lmax=arr[i];
            for(int j=0;j<i;j++){
                lmax=Math.max(lmax, arr[j]);
            }
            int rmax=arr[i];
            for(int j=i+1;j<arr.length;j++){
                rmax=Math.max(rmax,arr[j]);
            }
            res+=Math.min(lmax,rmax)-arr[i];
        }
        System.err.println(res);
    }
    public static void main(String[] args) {
        int [] arr=Arrayutility.inputArray();
        getWater(arr);
    }
}
