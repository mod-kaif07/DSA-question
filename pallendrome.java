import java.util.LinkedList;

import org.w3c.dom.Node;

public class pallendrome {

    public static class Node{
        int data;
        Node next; //next have same as class name 
        public Node(int data){
            this.data=data; //yha par yeh batya ja rha hn data key andar data hi hoga 
            this.next=null; // yha par yeh batya ja rh hn next key andar null value nhi hn 
        }
    }
    public static Node head;
    public static Node tail;
   
   
    public void addFirst(int data ){
        Node  newNode= new Node(data);
        if(head==null){
            head= tail= newNode;
            return;
        }
        newNode.next=head;
         head = newNode;
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data +">-");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static Node findMid(Node head){
        Node slow=head;
        Node fast = head;
        while (fast != null && fast.next != null){
             slow = slow.next;
             fast=fast.next.next;
        }
        return slow;
    }

    public static boolean checkpallendrome(){
     if (head == null || head.next == null) {
        return true;
     }
    Node midNode = findMid(head);
    Node pev= null;
    Node curr= midNode;
    Node next;
    while(curr != null){
        next=curr.next;
        curr.next=pev;
        pev=curr;
        curr=next;
    }
    Node right =pev;
    Node left =head;

    while (right != null){
        if(left.data != right.data){
            return false;
        }
        left =left.next;
        right=right.next;
    }
    return true;
}
    public static void main(String srgs[]){
        pallendrome ll = new pallendrome();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        if(checkpallendrome()){
            System.out.println("palindrome ");
        }
        else{
            System.out.println("not palindrome ");
        }
    }
}
