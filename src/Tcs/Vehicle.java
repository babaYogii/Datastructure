package Tcs;
import java.util.*;
public class Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v=sc.nextInt();
        int w=sc.nextInt();
        float wheel4=((4*v)-w)/2;
        System.out.println(wheel4);
        if(w>=2 && (w%2==0) && v<w)
        {System.out.println("TW = "+(int)(wheel4)+"FW = "+(int)(v-wheel4)  );}
        else{
            System.out.println("Invalid Input");
        }
    }
}
