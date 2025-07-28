public class SearchLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data1, Node next2) {
            this.data = data1;
            this.next = next2;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }

    // Custom class to return both node and index
    class SearchResult {
        Node node;
        int index;

        SearchResult(Node node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    // Method to print the linked list
    void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to search an element
    SearchResult search(Node head, int x) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == x) {
                return new SearchResult(temp, count);
            }
            temp = temp.next;
            count++;
        }
        return null; // Not found
    }

    // Main method
    public static void main(String[] args) {
        SearchLinkedList list = new SearchLinkedList();

        // Creating nodes
        Node head = list.new Node(10);
        head.next = list.new Node(20);
        head.next.next = list.new Node(30);
        head.next.next.next = list.new Node(40);

        // Printing the list
        System.out.println("Original linked list:");
        list.print(head);

        // Searching for a value
        int x = 30;
        SearchResult result = list.search(head, x);

        if (result != null) {
            System.out.println("Element " + x + " found at position: " + result.index);
        } else {
            System.out.println("Element " + x + " not found in the list.");
        }
    }
}
