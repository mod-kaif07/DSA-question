import java.util.Scanner;

public class reveseofnumber {
    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter last number");
        int num= scanner.nextInt();
        for(int i=num;i>=1;i--){
            System.out.println("number are:"+i);
        }

    }
}
