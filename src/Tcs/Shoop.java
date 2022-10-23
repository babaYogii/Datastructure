package Tcs;

public class Shoop {
    public static void main(String[] args) {
        System.out.println(price("b1A2"));
    }

    static int price(String str){
        int ans=0;
//        System.out.println((int)'b');
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                ans+=str.charAt(i)-48;
                System.out.println(ans);
            }
            else {

//                ans+=str.charAt(i);


            }
        }

        return ans;
    }

    int max(String str1){
        int a=0;




        return a;
    }

}
