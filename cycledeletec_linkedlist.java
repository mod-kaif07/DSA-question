


public class cycledeletec_linkedlist {

    static Node head;
    public  Node tail;
    static class Node {

        int data;
        Node next;

         Node(int data) {
            data = data;
            next = null;
        }
    }
   public static   boolean  delect_cycle(Node head){
      Node slow= head;
      Node fast= head;

      while(fast!=null &&fast.next!= null){
        slow= slow.next;
        fast= fast.next.next;
        if( slow== fast){
            return  true;
        }
      }

        return false;
    }

    public static void main(String[] args) {
        cycledeletec_linkedlist list = new cycledeletec_linkedlist();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;
        Boolean answer= delect_cycle(head);
        System.out.println("Given Linked list is have cycle:-"+answer);

    }
}
