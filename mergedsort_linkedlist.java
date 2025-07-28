
public class mergedsort_linkedlist {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    private static int size;

    public void addFirst(int data) {
        //step 1- create new node
        Node newNode = new Node(data);
        size++;// jaise new node aaya waise size increase ho gya 
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step-2 newNode Next=head
        newNode.next = head;

        //step-3 head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;

        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "> -");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node find_mid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node h1, Node h2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;

            }
        }
        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while (h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return mergedll.next;

    }

    public Node mergesort(Node head) {
        // base case 
        if (head == null || head.next == null) {
            return head;
        }
        //get mid 
        Node getmid = find_mid(head);
        Node righthead = getmid.next;
        getmid.next = null;
        Node lefthead = head;
        Node left = mergesort(lefthead);
        Node right = mergesort(righthead);

        return merge(left, right);
    }

    public static void main(String[] args) {
        mergedsort_linkedlist list = new mergedsort_linkedlist();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.print();
        list.head = list.mergesort(list.head);
        list.print();
    }

}
