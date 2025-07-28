import java.util.*;

public class plaaendromefun {
    public static void pallendrome(int num){
         int new_num=0;
         int original_num=num;
         int pow=0;
         while(num>0){
            int lastdigit= num%10;
            new_num=new_num +(lastdigit *(int) Math.pow(10,pow));
            num=num/10;
            pow++;
         }
        
         if(new_num==original_num){
            System.out.print("Given no is PALLENDROME");

         }
         else{
            System.out.print("NOT PALLENDROME");
         }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        int num=sc.nextInt();
        pallendrome(num);
    
    }

}
