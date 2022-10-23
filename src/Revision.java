public class Revision {

    static int revAnum(int num){
        int revnum=0;
        while(num>0){
             int newnum=num%10;
             revnum=(revnum*10+newnum);
        num/=10;
        }

        return revnum;
    }
    static String revAString( String string){
        String revString="";
        char arr[]=string.toCharArray();
        for (int i=string.length()-1;i>=0;i--){
             revString+=arr[i];
        }
            System.out.println(revString);

        return revString;
    }


    public static void main(String[] args) {
//        System.out.println(revAnum(1239865));
        String yogesh="Yogesh1";
        revAString(yogesh);
    }
}
