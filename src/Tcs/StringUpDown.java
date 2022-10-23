package Tcs;
import java.lang.*;



public class StringUpDown {

    public static void main(String[] args) {
//        System.out.println(updwon("campusmonk"));
        method2("CampusMonk");

    }

    static String updwon(String str){
//        String updownn=str;
    String ans="";
        for (int i = 0; i < str.length(); i++) {

            if(i%2==0){
               char ch=Character.toUpperCase(str.charAt(i));
               ans+=ch;
//                System.out.println(ch);
            }else{
                char ch=Character.toLowerCase(str.charAt(i));
                ans+=ch;
            }
        }
        return ans;
    }


    static void  method2(String str){
        String ans="";

        for (int i = 0; i <str.length() ; i++) {

            if(i%2==0){
                if(!(str.charAt(i)>='a' && str.charAt(i) <='z')){
                    char ch=str.charAt(i);
                    ans+=Character.toString( ch+32);
                }else {
                    ans+=str.charAt(i);
                }
            }else{
                if(!(str.charAt(i)>='A' && str.charAt(i)<='Z')){
                    char ch=str.charAt(i);
                    ans+=Character.toString(ch-32);
                }else {
                    ans+=str.charAt(i);
                }
            }
        }
        System.out.println(ans);
    }


}
