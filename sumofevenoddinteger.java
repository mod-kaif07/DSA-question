import java.util.Scanner;

public class sumofevenoddinteger {

    public static void main(String arg[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("enter how many inputs");
        int n =sc.nextInt();
        int sum_even=0;
        int sum_odd=0;
        int a=1;
        while(a<=n){
            Scanner scanner=new Scanner(System.in);
            int x = scanner.nextInt();
             a++;
         if(a%2==0){
            sum_even+=a;
         }
         else{
            sum_odd+=a;
         }
        }
        System.out.println("sum of odd number: "+sum_odd);
        System.out.println("sum of even number: "+sum_even);

    }
}