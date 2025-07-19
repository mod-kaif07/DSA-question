import javax.sound.midi.MidiDevice.Info;

public class Diameter_of_tree {
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

    public static int Diameter(Node root) { // this code having time complexibility is O(n^2)
        if (root == null) {
            return 0;

        }
        int Left_dia = Diameter(root.left);
        int left_height = height_Node(root.left);
        int right_dia = Diameter(root.right);
        int right_height = height_Node(root.right);

        int selfDiameter = left_height + right_height + 1;

        return Math.max(selfDiameter, Math.max(right_dia, Left_dia));

    }

    static class info {
        int Diam;
        int height;

        public info(int Diam, int height) {
            this.Diam = Diam;
            this.height = height;

        }

    }

    public static info Diameter2(Node root) {
        if (root == null) {
            return new info(0, 0);
        }
        info leftInfo = Diameter2(root.left);
        info rightInfo = Diameter2(root.right);

        int Diam = Math.max(leftInfo.height + rightInfo.height + 1,
                Math.max(leftInfo.Diam, rightInfo.Diam));
        int height = Math.max(leftInfo.height, rightInfo.height)+1;
         return new info(Diam, height);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(Diameter2(root).Diam);
        System.out.println(Diameter2(root).height);


    }
}
