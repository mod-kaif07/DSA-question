
public class removecyleliskelist {

    static Node head;
    public Node tail;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static boolean delect_cycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void remove(Node head) {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow!=fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    // public void print() {
    //     Node temp = head;
    //     while (temp != null) {
    //         System.out.print(temp.data + ">-");
    //         temp = temp.next;
    //     }
    //     System.out.println("Null");
    // }

    public static void main(String[] args) {
        cycledeletec_linkedlist list = new cycledeletec_linkedlist();

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(delect_cycle(head));
        remove(head);
        System.out.println(delect_cycle(head));

        // System.out.println("Given Linked list is have cycle:-" + answer);
    }
}
