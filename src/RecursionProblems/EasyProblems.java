package RecursionProblems;

public class EasyProblems {

      static void Print1toN(int n){
          if(n==0){
              return ;
          }
          Print1toN(n-1);
          System.out.println(n);
      }

      static void PrintNto1(int n){
          if(n==0){
              return ;
          }
          System.out.println(n);
          Print1toN(n-1);
      }

      static int Product_Of_1_To_N(int n){
          if(n==1){
              return 1;
          }
//          System.out.println(n);
//          System.out.println(ProductOf1ToN(n-1));
          return n*Product_Of_1_To_N((n-1));
      }

      static int SumOfDigits(int n){
         if(n==0){
             return 0;
         }
         return (n%10)+SumOfDigits(n/10);
      }


    public static void main(String[] args) {
        System.out.println( Product_Of_1_To_N(10));
        System.out.println(Sum(10));
        System.out.println(SumOfDigits(14));
    }

    static int Sum(int n){
          if(n==1){
              return 1;
          }
          return Sum(n-1)+n;
    }

}
