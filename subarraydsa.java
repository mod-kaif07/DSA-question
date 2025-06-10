

import java.util.*;
public class subarraydsa {
  
//this lgorithum having time comlexbity is B(n3).
    public static void reverse(int array[]){
        int total_subarray=0;
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
     for(int i=0;i<array.length;i++){
   
        for(int j=i+1;j<array.length;j++){
             currsum=0;
             for(int k=i;k<=j;k++){
                System.out.print(array[k]+","+" ");
                currsum+=array[k];
             } 
             System.out.println("current sum "+currsum);
             if(maxsum<currsum){
                maxsum=currsum;
             }
           
             total_subarray++;//increase the vlaue by +1 when element print i to j(start to end) all elements
             System.out.println("max sum of subarray"+maxsum);

        }
        System.out.println();
       
     } System.out.print("total subarrays"+total_subarray);
    }
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
        System.out.print("enter size");
        int size=sc.nextInt();
       
       int[]array=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter "+i+" element");
            array[i]=sc.nextInt();
        }
        reverse(array);
    }
}

