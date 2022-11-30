package tp;

import java.util.Arrays;

public class NoRepate {
    public static void main(String[] args) {
        int arr[]={1,5,1,3,4,5,4};

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(noRepeate(arr)));
  int ans=fun(45,10);
        System.out.println(ans);

    }

//    static int[] noRepeate(int[]arr){
//        int ans[]=new int[arr.length];
//        int ans2[]=new int[arr.length];
//        int n=arr.length;
//        boolean b=false;
//        int a=0;
//        for (int i = 0; i <arr.length ; i++) {
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    ans[a++]=arr[i];
//                    break;
//                }
//            }
//        }
//
//        return ans;
//    }


    static int fun(int x,int y){
        if(x!=50) return (y+fun(x+1,y));
        else return 0;
    }


}
