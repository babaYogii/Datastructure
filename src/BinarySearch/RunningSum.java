package BinarySearch;

import java.util.ArrayList;

public class RunningSum {

    static int [] GiveRunningSum(int []a){

        ArrayList<Integer> n1= new ArrayList<>();
int a1[];
        int sum=0;
        for(int i=0;i<a.length;i++){
             sum = sum+a[i];
             n1.add(sum);
            }

             return a1= new int [sum];
        }





    public static void main(String[] args) {
     int a[]={3,4,2,1};
        GiveRunningSum(a);


    }
}
