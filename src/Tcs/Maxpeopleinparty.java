package Tcs;

public class Maxpeopleinparty {
    public static void main(String[] args) {
        System.out.println(propleprs());
    }
    static int propleprs(){
        int max=0,sub=0;
        int [] entering={7,0,5,1,3};
        int [] lefting={1,2,1,3,4};
        for(int i=0, j=0;i<entering.length;i++,j++){

             sub+=entering[i]-lefting[j];

            if(sub>max){
                max=sub;
            }

        }
        return max;
    }
}
