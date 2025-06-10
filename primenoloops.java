import java.util.*;

public class primenoloops {
      public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        int num= sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.print("not prime ");
                break;
            }
            else{
                System.out.println("prime no");
                break;
            }
        }
    }
} 