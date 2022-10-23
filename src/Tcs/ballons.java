package Tcs;

public class ballons {
    public static void main(String[] args) {
        System.out.println(oddballon());
    }
    static char oddballon(){
        char [] ss={'g','r','r','r','b','b','g','y','y'};
        char ch=' ';
        int count=0;

         int s=0;
         int e=ss.length-1;
//        System.out.println(e);

        for (int i = 0; i < ss.length; i++) {
              if(ss[i]!=ss[e]){
                  e--;
              }else{
                  count++;
              }
        if(count%2==1){
            ch=ss[i];
        }
        }

        return ch;
    }


}
