import java.util.ArrayList;

public class indian_coin {
    public static void main(String[] args) {
        int coin[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int value = 590;
        int Number_of_coins = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = coin.length - 1; i >= 0; i--) {

            if (value >= coin[i]) {
                while (coin[i] <= value) {
                    Number_of_coins++;
                    ans.add(coin[i]);
                    value = value - coin[i];
                }

            }

        }
        System.out.println("Min Number of coin use :- " + Number_of_coins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}
