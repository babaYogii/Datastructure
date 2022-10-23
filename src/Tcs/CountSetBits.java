package Tcs;

public class CountSetBits {

    static int setbits(int a , int b){
        int count=0;
       int v=a*b;
        while(v>0){
            if(v%2==1){
                count++;
            }
                v=v/2;
        }
        return count;
    }



    public static void main(String[] args) {
    int a=setbits(7,3);
        System.out.println(a);
    }

}
