public class swapfunction {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);
    }

    public static void main(String args[]) {
        int a = 2;
        int b = 4;
        swap(a, b);
        System.out.println("a (after swap): " + a);
        System.out.println("b (after swap): " + b);
    }
}
