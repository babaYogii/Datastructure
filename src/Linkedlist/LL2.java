package Linkedlist;
import java.util.*;


public class LL2 {
    Scanner sc=new Scanner(System.in);

    private int size;
    public LL2(){
        this.size=0;
    }
    Node head;
     class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
            size++;
        }
    }

    void traverse(){
        Node curr=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }


      Node reverse(Node head){
         Node cur=head;
         Node prev=null;
         while(cur!=null){
             Node temp=cur.next;
             cur.next=prev;
             prev=cur;
             cur=temp;
         }
     return prev;
    }
    void addFirst(int data){
        Node da=new Node(data);
            da.next=head;
            head=da;
            return;
    }

     void addlast(int data){
         Node nd = new Node(data);
         if(head==null){
             head=nd;
         }
         Node prev=head;

         while(prev.next!=null){
             prev=prev.next;
         }
         prev.next=nd;

     }

     void insertAtAYnyPos(int data, int pos){
        Node datadd=new Node(data);

        if(pos==0){
            datadd.next=head;
            head=datadd;
            //traverse(head);  If we run with this line element is inserting and we are getting desired output
            return;
        }
        Node prev=head;
        for(int i=0;i<pos-1;i++){

            prev=prev.next;
        }
        datadd.next=prev.next;
        prev.next=datadd;

    }
    void deleteAtPos(){
        System.out.println("\n Enter the position which You want to delete");
         int pos1=sc.nextInt();
         size--;
         if(pos1==0){
             head=head.next;
             return;
         }
         Node prev=head;
         for(int i=0;i<pos1-1 ;i++){
             prev=prev.next;
         }
         prev.next=prev.next.next;
         traverse();
    }

    void reverseInGroup(LL2 list1 , int k ){
//         LL2 revList=new LL2();

         Node cur=list1.head;
         Node prev=null;
         int n=k;   //how much linked list you want to reverse

         while(cur!=null && n>0){
             Node after = cur.next;
             cur.next=prev;
             prev=cur;
             cur=after;
             n--;
         }

    }



    public Node duplicate(){
         Node node=head;
         while(node.next!=null){
             if(node.data==node.next.data){
                 node.next=node.next.next;
                 size--;
             }
             else{
                 node = node.next;
             }
         }
         return head;
    }

    int getSize(){
        return size;
    }

    public static LL2 merge(LL2 first,LL2 second) {
        Node f = first.head;
        Node s = second.head;

        LL2 ans = new LL2();

        while (f != null && s != null) {
            if (f.data < s.data) {
                ans.addlast(f.data);
                f = f.next;
            } else {
                ans.addlast(s.data);
                s = s.next;
            }
        }
        while (f != null) {
            ans.addlast(f.data);
            f = f.next;
        }
        while (s != null) {
            ans.addlast(s.data);
            s = s.next;
        }
        return ans;
    }




    public static void main(String[] args) {
        LL2 list=new LL2();
        list.addFirst(7);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(4);
        list.addFirst(5);


        list.insertAtAYnyPos(16,2);
        list.traverse();
//        list.deleteAtPos();
//        System.out.println(list.getSize());
      list.addlast(10);
//        list.traverse();
        System.out.println(list.duplicate().data);
//        System.out.println();
//        LL2 first= new LL2();
//        LL2 second= new LL2();
//
//        first.addFirst(2);
//        first.addFirst(2);
//        first.addFirst(3);
//        first.addFirst(4);
//        System.out.println();
//        second.addFirst(1);
//        second.addFirst(4);
//        second.addFirst(7);
//        second.addFirst(8);

//    merge(first,second);
//        list.reverse(list.head);
//        list.traverse();
     int array []={6,1,2,8,3,4,7,10,5};
     int sum=0;
        for(int i=1;i<=array.length+1;i++){
            sum+=i;
        }
        int sum1=0;
        for(int i=0;i< array.length;i++){
            sum1+=array[i];
        }
        System.out.println(sum1);
        System.out.println(sum);
        System.out.println(sum-sum1);







    }


}

