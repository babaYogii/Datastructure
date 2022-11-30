package tp;

import java.util.Arrays;

public class AlternateOrder {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
//        10,2,8,4,6
        System.out.println(Arrays.toString(alternate(arr)));
    }



    static int[] alternate(int[] arr){

        int [] arr1=new int[arr.length];

        int start=0;
        int end=arr.length;

        for(int i=0;i< arr.length;i++){
            if(i%2==0) {
                arr1[i] = arr[end-1];
                end--;
            }else{
               arr1[i]=arr[start];
               start++;
            }

        }

        for(int i=0;i<arr.length;i++){
            arr[i]=arr1[i];
        }

        return arr;
    }



    static void coffeeCombination(int a[][]){

    }

}
