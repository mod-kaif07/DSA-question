import java.util.Scanner;

public class binarytodecimal {


    public static void bin_num(int x){
        int my_num=x;
        int pow=0;
       int num=0;
        while(x>0){
            int lastdigit=x%10;
            num=num+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            x=x/10;
             
        }
     System.out.print("Decimal number of "+my_num+"="+num);

    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter binary number: ");
       int n=sc.nextInt();
       sc.close();
       bin_num(n);

    }
}
