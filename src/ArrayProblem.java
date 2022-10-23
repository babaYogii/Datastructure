import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayProblem {

   static List<Integer> addToArrayForm(int[] num, int k){
       ArrayList<Integer> list=new ArrayList<>();


       int carry=0;
       for(int i=num.length-1;i>=0;i--){
           num[i]=num[i]+k%10+carry;
           list.add(num[i]%10);
           carry=num[i]/10;
           k=k/10;
       }
       k=k+carry;
       while(k!=0){
           list.add(k%10);
       }
       Collections.reverse(list);

       return list;

    }


    public static void main(String[] args) {
       int []arr={1,2,0,0};
       int add=324;
        System.out.println(addToArrayForm(arr,add));
    }
}
