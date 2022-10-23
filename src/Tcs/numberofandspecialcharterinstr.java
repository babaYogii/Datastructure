package Tcs;

public class numberofandspecialcharterinstr {
    public static void main(String[] args) {
        String str="##****";
        System.out.println(numberofchar(str));
    }
    static int numberofchar(String str){
        int countstar=0;
        int counthash=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                countstar++;
            }
            if(str.charAt(i)=='#'){
                counthash++;
            }

        }

//  return countstar >counthash ? countstar-counthash:counthash-countstar;
       return countstar-counthash;
    }

}
