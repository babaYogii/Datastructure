package sorting;

import java.util.Arrays;


public class MergeSort {
    public static void main(String[] args) {
        int arr[]={5,7,3,8,1};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int [] mergesort(int [] arr){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int [] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return mix(left,right);

    }

    private static int[] mix(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;

       int [] ans = new int[left.length + right.length];

       while(left.length > i && right.length>j){
           if(left[i]<right[j]){
               ans[k]= left[i];
               i++;
           }else{
               ans[k]=right[j];
               j++;
           }
           k++;
       }
         while(left.length>i){
             ans[k]=left[i];
             i++;
             k++;
         }
         while(right.length>j){
             ans[k]=right[j];
             j++;
             k++;
         }
         return ans;
    }


}
