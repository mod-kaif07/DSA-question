import java.util.*;

public class max_length_chain_pairs {
    //this question smilier to the activity question only format will chnage 
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 },
                { 39, 60 },
                { 5, 28 },
                { 27, 40 },
                { 50, 90 } };
        int max_length_chain_pair = 1;
        int lastend = pairs[0][1];
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        for (int i = 0; i < pairs.length; i++) {

            if (pairs[i][0] >= lastend) {
                max_length_chain_pair++;
                lastend = pairs[i][1];
            }
        }
        System.out.println("max length of chain is :-" +max_length_chain_pair);
    }

}
