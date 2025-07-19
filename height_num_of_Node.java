public class height_num_of_Node {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int height_Node(Node root) {
        if (root == null) {
            return 0;
        }
        int leftroot = height_Node(root.left);
        int rightroot = height_Node(root.right);
        return Math.max(leftroot, rightroot) + 1;
    }

    public static int Num_of_Node(Node root) {
        if (root == null) {
            return 0;
        }
        int leftcount = Num_of_Node(root.left);
        int rightcount = Num_of_Node(root.right);
        return (leftcount + rightcount) + 1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int left_Sum= sum(root.left);
        int right_Sum= sum(root.right);
        return (left_Sum+right_Sum)+root.data;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 
        System.out.println(sum(root));

    }
}
