
public class find_subset {

    public static void subset(String str, String ans, int i_dx) {
        if (i_dx == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            }
            System.out.println(ans);
            return;
        }
        //choice YES
        subset(str, ans + str.charAt(i_dx), i_dx + 1);
        //choice No
        subset(str, ans, i_dx + 1);

    }

    public static void main(String[] args) {
        String str = "ab";
        String ans = "";
        subset(str, ans, 0);
    }
}
