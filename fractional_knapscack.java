package Greedy_Algorithum;
import java.util.*;

public class fractional_knapscack {
  public static void main(String[] args) {
    int value[] = { 60, 100, 120 };
    int weight[] = { 10, 20, 30 };
    int w = 50;
    double ratio[][] = new double[value.length][2]; 
    for (int i = 0; i < value.length; i++) {
      ratio[i][0] = i;
      ratio[i][1] = value[i] / (double) weight[i];
    }
    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
    int capcity = w;
    double finalvalue = 0;
    for (int i = ratio.length - 1; i >= 0; i--) {
      int idx = (int) ratio[i][0];
      if (capcity >= weight[idx]) {
        finalvalue += value[idx];
        capcity -= weight[idx];

      } else {
        finalvalue += (ratio[i][1] * capcity);
        capcity = 0;
        break;
      }
    }
    System.out.println("final value=" + finalvalue);

  }
}
