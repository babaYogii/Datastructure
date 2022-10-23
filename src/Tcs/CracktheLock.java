package Tcs;

public class CracktheLock {
    static int bankLock(int n){
        int ans=0;
        if(isArmstrong(n)){
            while(n>0){
                if((n%10)%2==0){
                    ans=ans+(n%10);
                }
                n/=10;
            }
        }else{
            while(n>0){
                if((n%10)%2==1){
                    ans=ans+(n%10);
                }
                n/=10;
            }
        }
        return ans;
    }

    private static boolean isArmstrong(int n) {
        int number=n;
        int last=n;
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        int sum=0;
//        System.out.println(number);
        while(number>0){
            int a=number%10;
            sum= (int) (sum+Math.pow(a,count));
            number/=10;
        }
        if(sum==last) return true;
        return false;
    }

    public static void main(String[] args) {
        int a=bankLock(547389122);
        System.out.println(a);
        System.out.println(isArmstrong(547389122));
    }
}
