
public class resvese_linlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node aage = null;
        while (curr != null) {
           aage =curr.next ;
            curr.next = prev;
            prev = curr;
            curr = aage;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Create linked list manually
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("orginial linklist");
        print(head);

        head=reverse(head);

        System.out.println("revese  linklist");
        print(head);
    }
}
