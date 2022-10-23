package Tcs;

import java.util.*;

public class nonRepeating {
    public static void main(String[] args) {
        int n=7;
        int []arr={4,7,4,6,7,1,4,5,8};
//        System.out.println(firstRepeting(arr, arr.length-1));
        int [] a=sortseprate(arr, arr.length-1);
        System.out.println(Arrays.toString(a));
    }

    static int notreeatingEle(int arr[],int n){

        for(int i=0;i<n;i++){
            for(int j=0;i<n;j++){
                if((i!=j) && arr[i]==arr[j]){
                    break;
                }
                if(j==n){
                    return arr[j];
                }
            }
        }
        return -1;
    }


    static int nonrepeting2(int arr[],int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        return -1;
    }

    static int firstRepeting(int arr[],int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int i=1;i<n;i++){
            if(map.get(arr[i])==2){
                return arr[i];
            }
        }
        return -1;
    }

    static int [] sortseprate(int arr[],int n){
        int ans[]= new int[arr.length];
        int even[]=new int[arr.length/2+arr.length%2];
        int odd[]=new int[arr.length-even.length];
        int x=0,y=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                even[x]=arr[i];
                x++;
            }else{
                odd[y]=arr[i];
                y++;
            }
        }
        x=odd.length;
        y= 0;
        Arrays.sort(even);
        Arrays.sort(odd);
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                ans[i]=even[x];
                x--;
            }else{
                ans[i]=odd[y];
                y++;
            }
        }

        return ans;
    }

static int [] sortEvenoDD(int [] nums){
        int [] odd= new int[nums.length/2+nums.length%2];
        int [] even = new int[nums.length/2+nums.length%2];

        for (int i=0;i<nums.length;++i){
        if(i%2==0){
            even[i/2]=nums[i];
        }else{
            odd[i/2]=nums[i];
        }
 }

        Arrays.sort(odd);
        Arrays.sort(even);
        for(int i=0;i<nums.length;++i){
            if(i%2==0){
                nums[i]=even[i/2];
            }else{
                nums[i]=odd[odd.length-1-i/2];
            }
        }

        return nums;
}



}
