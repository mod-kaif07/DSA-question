import java.util.*;


public class productfun {
    public static int product(int a,int b){
         int multiply=a*b;
         return multiply;
    }

    public static void main( String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter first number");
        int n= sc.nextInt();
        System.out.print("enter second number");
        int m=sc.nextInt();
       int answer= product(n,m);
       System.out.println("a*b :" +answer);

    }
}
