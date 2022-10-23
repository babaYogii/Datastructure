package Practice1;

public class Practice {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(j==5){
                    System.out.print(5+" ");
                } else if ((i==n)&&(j==1 || j==9)) {
                    System.out.print(1+" ");
                } else if ((i==n||i==n-1)&&(j==2||j==8)) {
                    System.out.print(2+" ");
                } else if ((i==n||i==n-1||i==n-2)&&(j==3||j==7)) {
                    System.out.print(3+" ");
                } else if ((i==n||i==n-1||i==n-2||i==n-3)&&(j==4||j==6)) {
                    System.out.print(4+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

      for(int i=1;i<=n;i++){
          for(int j=n-i;j>=1;j--){
              System.out.print("  ");
          }
          for(int p=n-i+1;p<=n;p++){
              System.out.print(p+" ");
          }
          for (int j = n; j>=n-i+2 ; j--) {
              System.out.print(j-1+" ");
          }
          System.out.println();
      }

        for(int i=1;i<=n;i++){
            int u=i;
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int p=n-i+1;p<=n;p++){
                System.out.print(n-i+1+" ");
            }
            for (int j = n; j>=n-i+2 ; j--) {
                System.out.print((n-u+1)+" ");
            }
            System.out.println();
        }

    }
}





//https://online.canarabank.in/index.html?module=login