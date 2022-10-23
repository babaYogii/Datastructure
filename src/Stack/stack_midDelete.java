package Stack;

import java.util.Stack;

public class stack_midDelete {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        deleteMid(s,s.size());

    }
    public static void deleteMid(Stack<Integer> s, int sizeOfStack){
        // code here

        int mid=0;
        if(sizeOfStack %2==0){
            mid=(sizeOfStack/2)-1;}
        else{
            mid=(sizeOfStack/2);}
        s.remove(mid);
        System.out.println(mid);
    }
}
