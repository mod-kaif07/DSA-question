
public class permutation {

    public static void find_permutation(String str, String ans) {
        //base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //recusrion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde"=>"ab"+"de"=>"abde";
            String new_str = str.substring(0, i)
                    + str.substring(i + 1, str.length());
            find_permutation(new_str, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        find_permutation(str, "");
    }
}
