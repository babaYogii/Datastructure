package Linkedlist;


class Node{
    int data;
//    Node head;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }

    static void traverse(Node head){
        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }

    }

    static void addFirst(Node head,int data){
        Node da=new Node(data);
        da.next=head;
        head=da;
//        traverse(head);
    }

    static void insertAtAYnyPos(int data,int pos,Node head){
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

    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);

        Node head= n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

//        traverse(head);

        addFirst(head,13);
//        insertAtAYnyPos(11,0,head);
        traverse(head);//but when we traverse here no element is added at 1st position




    }

}
