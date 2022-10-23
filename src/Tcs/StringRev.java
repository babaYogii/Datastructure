package Tcs;

public class StringRev {
    //You have to print the given string in such a way that the value of current character must be equal to
    //Character at its opposite side
    //for eg : a -> z , b-> y, c-> x so on
    public static void main(String[] args) {
        System.out.println(printthesrting("RedMi"));
    }

     static String printthesrting(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                char a=(char) (155-str.charAt(i));
                ans+=a;
            }else{
                char a=(char)(219-str.charAt(i));
                ans+=a;
            }
        }
        return ans;
    }

}
