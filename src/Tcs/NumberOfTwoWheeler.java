package Tcs;

public class NumberOfTwoWheeler {
    public static void main(String[] args) {
        vehicle(540,200);
    }

    static void vehicle(int wheels,int vehicles){
        if(wheels>=2 && (wheels%2==0) && vehicles<wheels) {
            int twowheeler=(wheels-2*vehicles)/2;
            int fourwheeler=vehicles-twowheeler;
            System.out.println("Two wheeler are : " + twowheeler + " & four wheeler are : " + fourwheeler);
        }else{
            System.out.println("Invalid input");
        }
    }
}
