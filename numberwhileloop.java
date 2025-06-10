import java.util.Scanner;

public class numberwhileloop{
    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter number");
        int num= scanner.nextInt();
        System.out.print("enter last digit");
        int last= scanner.nextInt();
        while (num<last){
            System.out.println(num);
            num++;
        }
    }
}