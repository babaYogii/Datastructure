package Practice;


import java.util.Scanner;

public class rotate {



    static void rotateFromStart(int []arr){
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        System.out.println("Rotated array : " );
        for(int e:arr){
            System.out.print(e +" ");
        }
    }


    static void rotateFromEnd(int []arr, int k){

            while (k > 0) {
                int last = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = last;
                k--;
            }
            System.out.println("Rotated array : ");
            for (int e : arr) {
                System.out.print(e + " ");
            }



    }
    public static void main(String[] args) {
        int []arr={1,23,4,5,9};
        char ans='y' ,ch='y';
        Scanner sc = new Scanner(System.in);
        String s ;

         do{
                System.out.println("Enter the position you want to rotate");
                int k = sc.nextInt();
                rotateFromEnd(arr, k);
             System.out.println("\n Do you want to continue ");
             s = sc.next();
             ans=s.charAt(0);
         }while(ans=='y');

        System.out.println();
//        roatetFromStart(arr);
    }

}
