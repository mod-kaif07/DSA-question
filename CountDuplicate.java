import java.util.Arrays;

public class CountDuplicate {
    public static int functionDuplicate(int n[]) {
        int slow = n[0];
        int fast = n[0];

        // Step 1: Detect cycle
        do {
            slow = n[slow];         // Move one step
            fast = n[n[fast]];      // Move two steps
        } while (slow != fast);

        // Step 2: Find the entrance of the cycle (duplicate number)
        fast = n[0];
        while (slow != fast) {
            slow = n[slow];
            fast = n[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 2};  // Valid input with duplicate
        int answer = functionDuplicate(arr);
        System.out.println("Duplicate number: " + answer);
    }
}
