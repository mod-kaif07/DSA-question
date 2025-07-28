import java.util.Scanner;

public class sumofdigit {
    public static long sum(long  n){
        long  a=n;
        long  sum=0;
        while (n>0) {
            long lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        
        return sum;

    }
    public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.print("enter number");
 long n=sc.nextInt();
 long answer=sum(n);
 System.out.print("sum of given number "+answer);
    }
}
