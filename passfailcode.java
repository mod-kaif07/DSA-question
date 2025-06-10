import java.util.Scanner;

public class passfailcode {
    public static void main(String arg[]){
      Scanner scanner=new Scanner(System.in);
      System.out.print("enter student marks");
      int marks = scanner.nextInt();
      if(marks>33){
        System.out.print("PASS");
      }
      else{
        System.out.print("FAIL");
      }

    }
}
