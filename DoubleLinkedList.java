
class Node {
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DoubleLinkedList {

    public static Node convertDLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp; // ✅ Link previous node to current
            prev = temp; // ✅ Move prev forward
        }

        return head;
    }

    public static Node removeNode(Node head, int x) {
        if (head == null && head.next == null) {
            return null;
        }
        Node temp = head;
        if (temp != null && temp.data == x) {
            Node back = head;
            head = head.next;
            if (head != null) {
                head.back = null;
            }
            back.next = null;
            return head;
        }
        while (temp != null) {
            if (temp.data == x) {
                if (temp.back != null) {
                    temp.back.next = temp.next;
                }
                if (temp.next != null) {
                    temp.next.back = temp.back;
                }

            }

            temp = temp.next;
        }

        return head;

    }

    public static Node INsertNodebeforehead(Node head, int x) {
        Node prevNode = new Node(x);
        if (head == null) {
            return prevNode;
        }

        prevNode.back = null;
        prevNode.next = head;
        head.back = prevNode;
        head = prevNode;

        return prevNode;
    }

    public static Node inertingNodekth(Node head, int k, int val) {

        Node newNode = new Node(val);

        if (k == 0) {
            newNode.next = head;
            head = newNode;
            return newNode;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == k - 1) {
                newNode.next = temp.next;
                newNode.back = temp;

                if (temp.next != null) {
                    temp.next.back = newNode;
                }
                temp.next = newNode;
                break;
            }

            temp = temp.next;
            count++;

        }

        return head;

    }

    public static Node addnodebeforetail(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.back.next = newNode;
        newNode.back = temp.back;
        newNode.next = temp;
        temp.back = newNode;

        return head;
    }

    public static void printDLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " <-> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node reveseDLL(Node head) {
        Node curr = head;
        Node previous = null;
        Node nexrNode = null;
        while (curr != null) {
            nexrNode = curr.next;
            curr.next = previous;
            previous = curr;

            curr = nexrNode;

        }

        return previous;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 99, 10 };
        Node head = convertDLL(arr);
        // head = removeNode(head, 90);
        // head = addnodebeforetail(head, 455);
        // head = INsertNodebeforehead(head, 255);
        // head = inertingNodekth(head, 0, 7);
        head = reveseDLL(head);
        printDLL(head);
    }
}
