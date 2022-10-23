import java.util.Arrays;
import java.util.Scanner;

public class AKshay {
    public static void main(String[] args) {
       int no=0b11;
       Scanner sc= new Scanner(System.in);
       int a= sc.nextInt();
   int []arr=new int[a];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= sc.nextInt();
        }

        if(arr.length==0){
            System.out.println(-1);
            return;
        }
        int b=arr[0];
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>b){
                count++;
            }else{
                continue;
            }

        }

        System.out.println(count);


    }
}
