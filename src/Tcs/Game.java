package Tcs;

public class Game {
    public static void main(String[] args) {
        int a []={5,8,4,4,4};
        int []b={4,2,4,1};
        System.out.println(game(a,b));
    }

    static String game(int a[],int b[]){
        String ans="";
        int n=a.length;
        int k=b.length;

        for (int i = 0; i <n ; i++) {
            if(a[i]==k){
                ans=ans+"1";
            }else{
                if(ispresent(b,a[i])){
                    ans=ans+"o";
                }else{
                    ans=ans+"#";
                }
            }

            }

        return ans;
    }


     static boolean ispresent(int a[],int h){
        boolean flag=false;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==h){
                flag= true;
            }
        }
        return flag;
    }
}
