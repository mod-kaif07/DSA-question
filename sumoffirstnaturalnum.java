import java.util.Scanner;

public class sumoffirstnaturalnum {
    public static void main(String arg[]){
        int sum=0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter number");
        int num= scanner.nextInt();
        int i=0;
         while(i<=num){
            sum=sum+i;
            i++;
         }
         System.err.print("sum:"+sum);
    }
}
