
import java.lang.classfile.components.ClassPrinter;


public class serachlinklist {

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
    public static int size;

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ">-");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
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

    public static int search(int key) {
        int idx = 0;
        Node seach = head;
        while (seach != null) {
            if (seach.data == key) {
                return idx;
            }
            seach = seach.next;
            idx++;
        }
        return -1;
    }

    public void midadd(int data, int idx) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void removefirst() {
        head = head.next;
        size--;

    }

    public void removelast() {
        if(size==0){
            System.out.println("invalid input ");
        }
        if(size==1){
            head=tail=null;
            size=0;
        }

        Node temp = head;

        while (temp != null) {
            if (temp.next.next == null) {
                temp.next = null;
                size--;
                return;
            }
            temp = temp.next;
        }
       
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void nth_delete_end(int idx) {
        if (head == null) {
            return;
        }

      
        if (idx > size) {
            System.out.println("invlaid input ");
            return;
        }
        if (idx == size) {
            head = head.next;
            size--;
            return;
        }

        Node prev = head;
        int i = 0;
        while (i < size - idx) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;

    }

    public  Node  mid_linked_list( Node head){
        Node slow=head;
        Node fast= head;
        while(fast!=null ||fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
        return  slow;

        
    }
    
   


    public static void main(String[] args) {
        serachlinklist list = new serachlinklist();
        list.addfirst(5);
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        // list.addLast(12);
        // list.print();
        // System.out.println("size" + size);

        // list.removefirst();
        // list.print();
        // System.out.println("size" + size);
        // list.removelast();
        // list.print();
        // System.out.println("size:-" + size);
        // list.midadd(10, 3);
        // list.print();;
        // int key=12;
        //  int answer =search(key);
        // System.out.println(key+" found at:-"+answer);
        // list.reverse();
        // list.print();
        // list.nth_delete_end(4);
        // list.print();
        // System.out.println("size" + size);




        //pallendrome 

    }
}
