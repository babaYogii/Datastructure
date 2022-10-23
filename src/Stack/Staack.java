package Stack;

import java.sql.SQLOutput;

public class Staack{
    int a[];
    private int Capacity;
    private int Size;
    int top;

    Staack(int capacity){
        this.Capacity=capacity;
        a = new int[Capacity];
        this.Size=0;
         top=-1;
    }

    void push(int data) throws Exception{
        if(Capacity-1==top){
            throw new Exception("Are bhai Full Hogya");
        }
        Size++;
        top++;
        a[top]=data;
    }
    int pop()throws Exception{
        if(top==-1){
            throw new Exception("Phele kuch insert kro tbhi to Delete kr paooge");
        }
        int res=a[top];
        top--;

        return res;
    }
    int peak()throws Exception{
        if(top==-1){
            throw new Exception("Kuch nhi he dhekne ke liye");
        }
        return a[top];
    }
    void isEmpty() throws Exception{
        if(top==-1){
            throw new Exception("ha bhai khali he ");
        }
        System.out.println("Kuch to He khali to nhi he");
    }

    int getSize(){
        return Size;
    }
    int max(){
        int maxelement=0;
        while(top!=-1){
            if(a[top]>maxelement){
                maxelement=a[top];
            }
            top--;
        }
        return maxelement;
    }

    Staack sort(Staack s1) throws Exception {
        Staack s2=new Staack(s1.getSize());

        return s2;

    }


    public static void main(String[] args) throws Exception {
        Staack li= new Staack(4);
        li.push(10);
        li.push(15);
        li.push(12);
        li.push(12);
        System.out.println(li.getSize());
//        System.out.println(li.peak());
//        System.out.println(li.max());
            li.sort(li);
//        System.out.println(li.pop());
//        System.out.println(li.pop());
//        System.out.println(li.pop());
//        System.out.println(li.pop());
    }



}