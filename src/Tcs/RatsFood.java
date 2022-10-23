package Tcs;

import java.util.Scanner;

public class RatsFood {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Food required for each rat : " );
        int unit=sc.nextInt();
        System.out.println("Enter the Number of rats present in an area :");
        int rat=sc.nextInt();

        System.out.println("Enter the houses present :");
        int size=sc.nextInt();
        System.out.println("Enter the food present in each house :");
        int []arr= new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The houses required for feeding foods are "+food(rat,unit,arr,size));
    }

    static int food(int r , int unit,int []arr,int size){
        int ans =r*unit;
        int sum=0;
        int i=0;
   if(arr.length==0) return -1;
        if(sum<=ans) {
            while (sum <= ans && i < arr.length) {
                sum += arr[i];
                i++;
            }
        }
     if(i>=size && sum!=ans){
            System.out.println("Food is not sufficient ");
        }
          return i;
    }





}
