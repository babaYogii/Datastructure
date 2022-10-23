package RecursionProblems;

import java.util.*;

public class rushi {
//  static   int a=0;
//    static int b=1;
//    static int c=0;


    static  void fibo(int count,int first,int second,int sum){
        if(count==0){
               return;
        }
        if(count>0){
            fibo(count-1 ,first=second,second=sum,sum=first+second);
            System.out.print(sum+ " ");
        }
    }

    static boolean arm1(int n,int size){

  int len=(int) (Math.log10(n)+1);
        int cout=0;

        while(n>0){
            cout++;
            n/=10;
        }
        System.out.println(cout);


        int g=n;
        int cube=0;
        int sum=0;
        for(int i=0;i<=size;i++){
            int a=n%10;
            n/=10;
            cube=a*a*a;
            sum+=cube;

        }
        if(sum==g){
            return true;
        }
        return false;


    }


    static void arm3(int n,int size,int sum){
        int g=n;
        int sum1=sum;
        int a=n%10;
        n/=10;
        int cube=a*a*a;
        sum1+=cube;
        if(size==0){
            return;
        }
        System.out.println(sum1);
        arm3(n,size-1,sum1);
        if(g==sum1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    static  boolean armstrong(int n,int size) {
        int g=n;

        int a = n % 10;
        n = n / 10;
        int b = n % 10;
        n = n / 10;
        int c = n % 10;


        int acube = a * a * a;
        int bcube = b * b * b;
        int ccube = c * c * c;

        int sum = acube + bcube + ccube;

        System.out.println(acube);
        System.out.println(bcube);
        System.out.println(ccube);
        System.out.println(sum);

//        if (g==sum) {
//            return true;
//        }
//        return false;
        return g==sum ? true:false;
    }

    static boolean arm(int n ){
        int g=n;
        int cube=0;
        int sum=n%10;
        n/=10;
        cube=sum*sum*sum;
        if(g==cube){
            return true;
        }
        return false;

    }


    static int first=0;
    static  int second=1;
    static int sum=0;
    static void fibo2(int n){
        if(n==5){
            return;
        }

        if(n<0){
           sum=first+second;
           first=second;
           second=sum;
            System.out.println(sum);
            fibo2(n-1);
        }
    }

    static void fibo1(int n){
        int a=0;
        int b=1;
        int sum =0;
        System.out.println();
        System.out.print(a+" "+b+" ");


        for(int i=0;i<n-2;i++){
            sum=a+b;
            System.out.print(sum+ " ");
            a=b;
            b=sum;
        }
    }

    public static int[] merge(int[] arr) {
     if (arr.length==1){
         return arr;
     }
     int mid=arr.length/2;

     int []left=merge(Arrays.copyOfRange(arr,0,mid));
     int []right=merge(Arrays.copyOfRange(arr,mid,arr.length));

       return mix(left,right);
    }

    private static int[] mix(int[] left, int[] right) {
        int [] miix =new int[left.length+right.length];
        int i=0;
        int k=0;
        int j=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                miix[k]=left[i];
                i++;
            }else{
                miix[k]=right[j];
                j++;
            }
            k++;
        }
        while(left.length>i){
            miix[k]=left[i];
            i++;
            k++;
        }
        while(right.length>j){
            miix[k]=right[j];
            j++;
            k++;
        }
        return miix;

    }


    static int findmax(int arr[],int i){
     int max=0;
     int []ux=merge(arr);

     if(i==0){
         return max;
     }
     if(ux[i]>max){
         max=ux[i];
     }
     findmax(ux,i-1);
     return max;
    }



    public static void main(String[] args) {

//        fibo(9,0,1,0);
//        fibo1(9);
//        fibo2(9);
//        System.out.println(armstrong(370));
//        System.out.println(arm(153));
//        System.out.println(arm1(372,3));
//        arm3(153,3,0);
        int arr[]={5,6,1,28,4};
//        System.out.println(arr.length);
        int ans=findmax(arr,arr.length-1);
        System.out.println(ans);
//        System.out.println(armstrong(143,3));
    }


}
