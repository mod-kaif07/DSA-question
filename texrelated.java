import java.util.Scanner;

public class texrelated {
      public static void main(String arg[]){
        int tax;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter income ");
        int income = scanner.nextInt();
          if(income<500000){
            tax=0;
          }
          else if(income>500000 && income<1000000){
            tax=(int)(income*0.2);
            //here tax data type is integer type on the other-hand income and 0.2 is float data type right hand side is double data type so we have to make data type equal both side so we have to type casting //
          }
          else{
            tax=(int)(income*0.3);
          }
         System.out.println("your tax "+tax);
      }

      
}
