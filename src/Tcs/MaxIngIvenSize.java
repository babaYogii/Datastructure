package Tcs;

import java.util.Arrays;

public class MaxIngIvenSize {
    public static void main(String[] args) {
        int arr[]={8};
        int k=4;
       int [] a= maxNumber(arr,k);
        System.out.println(Arrays.toString(a));
    }


    static int [] maxNumber(int []arr,int k){
        if(arr.length<k) return new int[0];
        if(arr.length==0)return new int[0];
        int a[]=new int [(arr.length)/2+1];
       int s=arr.length;
        int max=0;
        int u=0;
       for(int i=0;i<s/2+1;i++){
           a[u]= maxIngivenRange(Arrays.copyOfRange(arr,i,k),k);
           k++;
           u++;
       }
        return a;
    }

    static int maxIngivenRange(int []arr,int k){
//        System.out.println(Arrays.toString(arr));
        int a=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }

//        System.out.println(a);
        return a;
    }
}
