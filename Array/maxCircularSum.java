package Array;

public class maxCircularSum {
    //Kadane Algorithm
    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(max<sum)max=sum;
            if(sum<0)sum=0;
        }
        return max;
    }
    public static  int maxSubarraySumCircular(int[] nums) {
       int max_normal=maxSubArray(nums);
       if(max_normal<0)return max_normal;
       int arr_sum=0;
       for(int i=0;i<nums.length;i++){
        arr_sum+=nums[i];
        nums[i]=-nums[i];
       }
       int max_circular=arr_sum+maxSubArray(nums);
       return Math.max(max_normal,max_circular);
    }
    public static void main(String[] args) {
        int nums[]=Arrayutility.inputArray();
        int maxcircular=maxSubarraySumCircular(nums);
        System.out.println(maxcircular);
    }
}
