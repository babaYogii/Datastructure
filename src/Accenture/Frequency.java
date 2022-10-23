package Accenture;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int arr[]={8,9,10,11};
        frequency(arr);
    }

    static void frequency(int [] arr){
        for(int i=0;i<arr.length;i+=2){
            for(int j=0;j<arr[i+1];j++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
