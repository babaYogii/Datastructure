package Tcs;

public class Maxnumberofones {

    public static void main(String[] args) {
        System.out.println(maxones());
    }

    static int maxones(){
        int index=0;

        int [][]arr={{1,1,0},{1,1,1},{0,1,1}};
        int col=3;
        int count=0,max=0;
        for(int i=0;i<3;i++){
            count=0;
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    count++;
                }
                if(count>max){
                    max=count;
                    index=i+1;
                }
            }
        }

        return index;
    }
}
