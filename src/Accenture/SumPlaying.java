package Accenture;

import java.util.Arrays;

public class SumPlaying {
    public static void main(String[] args) {
        int [] arr={8,4,5,3,2,6,9,1};
        int []a=sumarray(arr);
        System.out.println(Arrays.toString(a));
    }

    static int [] sumarray(int []arr){
        int []ans=new int[arr.length];
        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] > arr[j]) {
                    a=a+arr[j];
                }else{
                    b=b+arr[j];
                }
                ans[i]=a*b;
            }
            a=0;
            b=0;
        }



        return ans;
    }


}
