package Tcs;

public class capgemini {
    public static void main(String[] args) {
//        System.out.println(count_min(8));
    }
    public static int count_min(int n){
        int res=0;
        while(n!=1){
            if(n%2==0){
                n/=2;
            } else if (n==3) {
                res=2;
                break;
            }else if((n&3)==3){
                n=n+1;
            }res++;
        }
        return res;
    }


}
