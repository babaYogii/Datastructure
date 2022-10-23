package BinarySearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_sum {

     static int[] twosum(int[] nums, int target){
         int []result =new int[2];
         Map<Integer,Integer> map = new HashMap<>();
         for(int i =0 ; i<nums.length;i++){
             if(map.containsKey(target-nums[i])){
                  result[1]=i;
                  result[0]=map.get(target-nums[i]);
                  return result;
             }
             map.put(nums[i],i);
         }
         return result;
     }
    static int[] twosum2(int [] nums,int target) {
        int []result =new int[2];

         int start= 0;
         int end =nums.length-1;

         while(nums[start]+nums[end]!=target){
             if(nums[start]+nums[end]<target){
                 start++;
             }else{
                 end--;
             }
//        System.out.print(start);
;
         }

        result[0]=start+1;
        result[1]=end+1;
        System.out.print(end+" ");

        return result;
//        int start=0;
//        int end=nums.length-1;
//
//        while(nums[start]+nums[end]!=target){
//            if(nums[start]+nums[end]<target){
//                start++;
//            }else{end--;}
//        }
//
//
//        return new int[] {start+1,end+1};

   }



    public static void main(String[] args) {
        int target=9;
        int [] nums={2,7,11,15};
        System.out.println(Arrays.toString(twosum2(nums,target)));



    }
}
