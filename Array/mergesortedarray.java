package Array;

public class mergesortedarray {
    public static int[] mergeArray(int arr1[],int arr2[]){
        int n=arr1.length+arr2.length;
        int newArr[]=new int[n];
        int j=0,k=0,i=0;
        while(i<arr1.length ||j<arr2.length){
            if(j==arr2.length||(i<arr1.length&&arr1[i]<arr2[j])){
            newArr[k++]=arr1[i++];
            }else newArr[k++]=arr2[j++];
        }

        
        return newArr;
    }

    public static void main(String[] args) {
        int [] arr1=Arrayutility.inputArray();
        int [] arr2=Arrayutility.inputArray();
        int mergeArr[]=mergeArray(arr1,arr2);
        Arrayutility.display(mergeArr);
    }
}
