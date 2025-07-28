import java.util.*;

public class factorial {
public static void main( String arg[]){
    long fact=1;
     Scanner sc= new Scanner(System.in);
     System.out.println("enter number ");;
     int num=sc.nextInt();
      for(int i=1;i<=num;i++){
       fact=fact*i;
     }
     System.out.print("factorial :" +fact);
     sc.close();
    }
} 