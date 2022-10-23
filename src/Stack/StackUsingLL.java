package Stack;

import java.util.Scanner;
import Linkedlist.LL2;


public class StackUsingLL {

    int Size;


    Node head;
    class Node{
        int data;
        StackUsingLL.Node next;

        Node(int data){
            this.data=data;
            next=null;
            Size++;
        }
    }
    StackUsingLL(){
        this.Size=0;
        head=null;
    }

    void push(int data){
        Node n1=new Node(data);
        n1.next=head;
        head=n1;
    }

    int pop() throws Exception{
        if(head==null){
            throw new Exception("Kuch nhi he dhek kya rha he");
        }
        Size--;
        int res=head.data;
        head=head.next;
        return res;

    }
    int peak()throws Exception{
        if(head==null){
            throw new Exception("Kuch nhi he dhek kya rha he");
        }
        return head.data;
    }

    void isEmpty()throws Exception{
        if(head==null){
            System.out.println("Ha bhai Empty huu");
        }
        System.out.println("muj me 1 se Jayada element present he ");
    }
    void getSize(){
        System.out.println("Size is "+ " "+Size);
    }



    public static void main(String[] args) throws Exception {
        StackUsingLL ld=new StackUsingLL();
        ld.push(11);
        ld.push(11);
        ld.push(00);
//        ld.pop();
        ld.isEmpty();
        System.out.println(ld.peak());
        ld.getSize();



    }
}
