package pattern;

import java.util.Arrays;

public class triangle {
    public static void main(String[] args) {
//        trainaglereverse(4,0);
        int ar[]={4,3,2,1};
        bubble(ar,ar.length-1,0);
        System.out.println(Arrays.toString(ar));
    }
    static  void trainagleregular(int row,int column){
        if(row==0){
            return;
        }
        if(column<row){
            System.out.print("*"+" ");
            trainagleregular(row,column+1);
        }else{
            System.out.println();
            trainagleregular(row-1,0);
        }
    } static  void trainaglereverse(int row,int column){
        if(row==0){
            return;
        }
        if(column<row){
            trainaglereverse(row,column+1);
            System.out.print("*"+" ");
        }else{
            trainaglereverse(row-1,0);
            System.out.println();
        }
    }

    static void bubble(int arr[],int arraylength, int currentIndex){
        if(arraylength==0){
            return;
        }
        if(arraylength>currentIndex) {
            if (arr[currentIndex] > arr[currentIndex + 1]) {
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex + 1];
                arr[currentIndex + 1] = temp;
            }
            bubble(arr, arraylength, currentIndex + 1);
        }else{
            bubble(arr,arraylength-1,0);
        }

    }
}
