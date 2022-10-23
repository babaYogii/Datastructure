package Stack;
import java.util.*;




public class stackExample {

    static void nearestsmallestElement(int a[]){
        Stack<Integer> s1=new Stack<>();

for (int i=0;i<a.length;i++){

    while(!s1.isEmpty()&& s1.peek()>=a[i]){
        s1.pop();
    }
    if(s1.isEmpty()){
        System.out.print(-1+" ");
    }
    else{
        System.out.print(s1.peek()+" ");
    }
    s1.push(a[i]);
}


    }

    //Nearrest Greatest element

    static void nearestGreaterElement(int a[]) {
        Deque<Integer> s1 = new ArrayDeque<>();

        System.out.println();

        for (int i = 0; i < a.length;i++ ){
            while (!s1.isEmpty()&&s1.peek()<=a[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(s1.peek()+" ");
            }
            s1.push(a[i]);
        }
    }

    public static void main(String[] args) {

        int []a={10,20,30,40,50};
        int a1[]={50,40,30,20,10};

        nearestsmallestElement(a);
        nearestGreaterElement(a1);

    }
}
