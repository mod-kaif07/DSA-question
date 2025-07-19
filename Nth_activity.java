// package GreedyAlgorithum;

import java.util.*;

public class Nth_activity {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

         // 1st activity 
         maxAct=1;
         ans.add(0);
         int lastEnd= end[0];

         for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd= end[i];
            }
         }
          //Display the vlaue 
         System.out.println("Max activity"+maxAct);
         for(int i=0;i<ans.size();i++){
            System.out.print("Activity"+ans.get(i)+"   ");
         }
         System.out.println();
    }
}
