public class checkevenodd {
    public static void oddeven(int x) {
        int bitMask = 1;
        if ((x & bitMask) == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void main(String[] args) {
        oddeven(3);
        oddeven(11);
        oddeven(14);
        
    }
}
