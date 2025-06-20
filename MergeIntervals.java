import java.util.Arrays;

public class MergeIntervals {
    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // Step 1: Sort intervals by their start values
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;
        int[][] merged = new int[n][2]; // Maximum size needed
        int index = 0; // Tracks the last inserted position

        // Step 2: Iterate through intervals and merge
        merged[0] = intervals[0]; // First interval is always included

        for (int i = 1; i < n; i++) {
            int[] prev = merged[index]; // Last inserted interval
            int[] curr = intervals[i];

            if (curr[0] <= prev[1]) { // Overlapping case
                prev[1] = Math.max(prev[1], curr[1]); // Merge intervals
            } else { // No overlap, add new interval
                index++;
                merged[index] = curr;
            }
        }

        // Step 3: Copy valid merged intervals to a correctly sized array
        return Arrays.copyOf(merged, index + 1);
    }

    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        int[][] finalMatrix = mergeIntervals(intervals);

        // Print merged intervals
        System.out.println("Merged Intervals:");
        for (int[] interval : finalMatrix) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
        System.out.println();
    }
}
