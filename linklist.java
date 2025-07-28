public class linklist {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;

    public void addfirst(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void add_last(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = null;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void add_middle(int data, int idex) {
        node newnode = new node(data);
        int i = 0;
        node temp = head;
        while (i < idex - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removefirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void removelast() {
        if (head == null && tail == null) {
            return;
        }
        node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;

    }

    public static void main(String args[]) {
        linklist ll = new linklist();
        ll.addfirst(1);
        ll.addfirst(3);
        ll.addfirst(6);
        ll.addfirst(8);
        ll.addfirst(9);
        ll.add_last(0);
        ll.add_middle(2, 5);
        ll.removefirst();
        ll.removelast();
        ll.print(); // Output: 9 -> 8 -> 6 -> 3 -> 1 -> null
    }
}
