// There are 
// 𝑁
// N items in a shop. You know that the price of the 
// 𝑖
// i-th item is 
// 𝐴
// 𝑖
// A 
// i
// ​
//  . Chef wants to buy all the 
// 𝑁
// N items.

// There is also a discount coupon that costs 
// 𝑋
// X rupees and reduces the cost of every item by 
// 𝑌
// Y rupees. If the price of an item was initially 
// ≤
// 𝑌
// ≤Y, it becomes free, i.e, costs 
// 0
// 0.

// Determine whether Chef should buy the discount coupon or not. Chef will buy the discount
//  coupon if and only if the total price he pays after buying the discount coupon is strictly less
//   than the price he pays without buying the discount coupon.






import java.util.*;
public class codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = scanner.nextInt();
            }

            int totalCostWithoutCoupon = 0;
            for (int j = 0; j < N; j++) {
                totalCostWithoutCoupon += A[j];
            }

            int totalCostWithCoupon = X;
            for (int j = 0; j < N; j++) {
                totalCostWithCoupon += Math.max(0, A[j] - Y);
            }

            if (totalCostWithCoupon < totalCostWithoutCoupon) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }
    }
}

