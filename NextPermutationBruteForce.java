import java.util.Arrays;

public class NextPermutationBruteForce {
    static boolean nextPermutation(int[] nums) {
        int n = nums.length;
        
        // Generate the next lexicographical permutation
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        
        reverse(nums, i + 1, n - 1);
        return true;
    }
    
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void findNextPermutation(int[] nums) {
        int n = nums.length;
        
        // Generate all permutations
        int[][] permutations = generateAllPermutations(nums);
        
        // Sort permutations
        Arrays.sort(permutations, (a, b) -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) return Integer.compare(a[i], b[i]);
            }
            return 0;
        });

        // Find current permutation and next one
        for (int i = 0; i < permutations.length; i++) {
            if (Arrays.equals(permutations[i], nums)) {
                int[] nextPerm = (i + 1 < permutations.length) ? permutations[i + 1] : permutations[0];
                System.arraycopy(nextPerm, 0, nums, 0, n);
                return;
            }
        }
    }

    static int[][] generateAllPermutations(int[] nums) {
        int n = nums.length;
        int fact = factorial(n);
        int[][] permutations = new int[fact][n];
        
        int[] temp = Arrays.copyOf(nums, n);
        for (int i = 0; i < fact; i++) {
            permutations[i] = Arrays.copyOf(temp, n);
            nextPermutation(temp);
        }
        
        return permutations;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        findNextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // Output: [1, 3, 2]
    }
}

