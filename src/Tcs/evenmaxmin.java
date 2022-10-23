package Tcs;

public class evenmaxmin {
    public static void main(String[] args) {
        int a=3521;
        int b=2452;
        int c=1352;
//        int d=min(a%100,b%100,c%100);
        int ans=1;
        for(int i=0;i<=3;i++){
            if(i%2==0){
                ans += (int) Math.pow(10,i)*max(a%10,b%10,c%10);
            }else{
                ans+=(int) Math.pow(10,i)*min(a%10,b%10,c%10);
            }
            a/=10;
            b/=10;
            c/=10;
        }
        System.out.println(ans);

    }


     static int max(int a, int b, int c){
        int Max=0;
        if(a>b && a>c){
            Max=a;
        } else if(b>c && b>a){
            Max=b;
        } if(c>a && c>b){
            Max=c;
        }
        System.out.println("Find max "+a+" "+b+" "+c+" Max is : "+ Max);
        return Max;
    }
    static int min(int a, int b, int c){
        System.out.println("Find min "+a+" "+b+" "+c);

        int mini=0;
        if(a<b && a<c){
            mini=a;
        } else if(b<c && b<a){
            mini=b;
        } if(c<a && c<b){
            mini=c;
        }
        return mini;
    }

}
