import java.util.*;
public class addFristLL {
    public static class Node{
        int date;
        Node next;
        public Node(int data){
            this.date=data;
            this.next= null
        }
    }
    public static Node head;
    public static Node tail;
    public void addFrist(int data){
        // step 1 :-crate new node
        Node newNode=new Node(data);
        if(head==null){
            head= tail=newNode;
            return;
        }
        //step 2 :-newNode next = head
        newNode.next=head;  //link
    }
    //step 3:- head = newNode
    head=newNode;
}
public static void main(String args[]){
    LinkedList ll = new linkedList();
    ll.addFrist(1);
    ll.addfrist(2);
}