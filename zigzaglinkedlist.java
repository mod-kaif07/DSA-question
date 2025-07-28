
public class zigzaglinkedlist {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void zig_zag() {
        if (head == null) {
            return;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        System.out.println("mid elemnnt>- "+mid.data);
        Node curr = mid.next;
        mid.next = null;

        //reverse the right part 
        Node prev = null;
        
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node lefthead = head;
        Node righhead = prev;
        Node nextL, nextR; // to store the next value 

        while (lefthead != null && righhead != null) {
            nextL = lefthead.next;
            lefthead.next = righhead;
            nextR = righhead.next;
            righhead.next = nextL;

            //updatatation
            lefthead= nextL;
            righhead=nextR;
        }
    }
    public  void print(){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data+"> - ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        zigzaglinkedlist list = new zigzaglinkedlist();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        System.out.println("Original List:");
        list.print();
        list.zig_zag();
        System.out.println("Zigzag List:");
        list.print();

    }
}
