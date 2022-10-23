package Tcs;

import java.util.Arrays;

public class rotatefromstart {
    public static void main(String[] args) {
       rotate(2);
    }

    static void rotate(int r) {
        int[] arr = {1, 2, 3, 4, 5};
        while(r>0) {
        int first=arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = first;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
