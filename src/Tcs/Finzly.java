package Tcs;

public class Finzly {
    public static void main(String[] args) {
        System.out.println(fun(4,5,4));
    }
    static int fun(int a , int b,int c){
       if((1+3)<b){
           c=(3+10)&a;
           c=c&c;
           b=(b+3)+a;
       }
       return a+b+c;


    }
}
