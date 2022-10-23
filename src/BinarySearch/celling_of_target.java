package BinarySearch;

public class celling_of_target {

    static int cellingOfNumber(int nums[],int target){
int start=0;
int end=nums.length;


while(start<end){

    int mid=(start+end)/2;
    if(target==mid){
        return mid;
    }
    if(target>nums[mid]){
        start=mid+1;
    }else{
        end=mid-1;
    }
}
return start;
    }

    public static void main(String[] args) {

        int[] nums={1,2,3,6,7};
        int target=6;
        System.out.print(cellingOfNumber(nums,target));
    }
}
