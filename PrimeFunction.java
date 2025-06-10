
import java.util.*;
public class PrimeFunction{
    public static boolean isprime(int  n){
        boolean isprime= true;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                isprime= false;
                break;
            }
        }
        return  isprime;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter  a number:");
        int n= sc.nextInt();
        sc.close();
         isprime(n);
    }
}
