import java.util.ArrayList;
import java.util.Arrays;

public class sawbhavtechlabs {

    public static void main(String[] args) {

        int arr[][] = {{100,198,333,323},
                {122,232,221,111},
                {223,565,245,764}
        };
        ArrayList a =maxrev(arr,3,4);
//        System.out.println(a);
//        loop();
//        System.out.println(secondgreatestNumber(new int[]{20}));
        System.out.println(isSubstring2("hello","lo"));
    }



        static ArrayList<Integer> maxrev(int[][] arr,int n,int m){
           int max=0;
            ArrayList<Integer> a1= new ArrayList<>();
              for(int i=0;i<=n-1;i++){
                  max=0;
                  for(int j=0;j<=m-1;j++){
                      if(max<arr[i][j]){
                          max=arr[i][j];
                      }
                  }
                      a1.add(max);
              }
            return a1;
        }

        static void loop(){
            for (int i = 9; i !=0 ; i--) {
                System.out.println(i);
                i=i-1;
            }
        }

        static int secondgreatestNumber(int [] arr){
          int ans=-1;
          if(arr.length>=2){
          Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
              return arr[arr.length-2];
          }
        return ans;
        }

         static boolean isSubstring(String s1,String s2){
          int a =-1;
            a=s1.indexOf(s2);
//             System.out.println(a);
        return (a==-1) ? false:true;
         }
    static boolean isSubstring2(String s1,String s2){
//        int a =-1;
        boolean a=s1.contains(s2);
//             System.out.println(a);
        return a;
    }






}
