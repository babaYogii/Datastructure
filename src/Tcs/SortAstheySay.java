package Tcs;

import java.util.Arrays;

public class SortAstheySay {

    public static void main(String[] args) {
     int arr[]={4,7,4,6,7,1,4,5,8};
     int [] a=sortevenodd(arr);
        System.out.println(Arrays.toString(a));
    }


    static int [] sortevenodd(int arr []){

        int []even=new int[arr.length/2+arr.length%2];
        int odd[]=new int[arr.length-even.length];
     int x=0;
     int y=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                even[x]=arr[i];
                x++;
            }else{
                odd[y]=arr[i];
                y++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        x=even.length-1;
        y=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){
                 arr[i]=even[x];
                 x--;
            }else{
                arr[i]=odd[y];
                y++;
            }
        }

        return arr;
    }


}
