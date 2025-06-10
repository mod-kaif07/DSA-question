import java.util.Scanner;

public class evenoddfunction2 {
    public static boolean evenodd(int a){
        boolean evenodd = true; //true means the gievn number is even
        if(a%2!=0){
            evenodd=false;// false means the given number is odd
        }
        return evenodd;
    }
    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.print("enter number ");
     int n=sc.nextInt();
     sc.close();
      boolean answer=evenodd( n);
      System.out.print("Given number is :"+answer);
    }
}
