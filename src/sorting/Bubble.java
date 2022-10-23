package sorting;

import RecursionProblems.Array;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int arr[]={1,2,5,8,1};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
            static int a=1;
    static void bubble(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(a++);
   String de="String";
   String de1="string";
   int a=10;
   int b=10;
//            System.out.println(de.isEmpty());
            System.out.println(de.equals(de1));
            System.out.println(de==de1);
   for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

