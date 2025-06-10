import java.util.Scanner;

public class calculator {
     public static void main(String arg[]){
      Scanner scanner=new Scanner(System.in);
      System.out.print("enter 1st number");
      int a= scanner.nextInt();
      System.out.print("enter 2st number");
      int b=scanner.nextInt();
      System.out.print("enter operator");
      char operator= scanner.next().charAt(0);
      switch(operator){
        case '+':System.out.print(+(a+b));
        break;
        case'-': System.out.print(+(a-b));
        break;
        case'*': System.out.print(+(a*b));
        break;
        case'/': System.out.print(+(a/b));
        break;
        case'%': System.out.print(+(a%b));
        break;
      }
    }
}
