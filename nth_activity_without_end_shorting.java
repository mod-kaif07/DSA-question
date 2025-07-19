// package GreedyAlgorithum;
import java.util.*;

public class nth_activity_without_end_shorting {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // Initialize the activity array correctly
        int activity[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i; // Store the index of the activity
            activity[i][1] = start[i]; // Start time
            activity[i][2] = end[i]; // End time
        }

        // Sort activities based on end times
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity 
        maxAct = 1;
        ans.add(activity[0][0]); // Add the index of the first activity
        int lastEnd = activity[0][2];

        for (int i = 1; i < activity.length; i++) { 
            if (activity[i][1] >= lastEnd) { // Check start time against lastEnd
                maxAct++;
                ans.add(activity[i][0]); // Add the index of the current activity
                lastEnd = activity[i][2]; // Update lastEnd to the end time of the current activity
            }
        }

        // Display the value 
        System.out.println("Max activities: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("Activity " + ans.get(i) + "   ");
        }
        System.out.println();
    }
}
