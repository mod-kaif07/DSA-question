import java.util.Scanner;

public class weekcode {
    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter day number");
        int day=scanner.nextInt();
        switch(day){
            case 1: System.out.print("MONDAY");
            break;
            case 2: System.out.print("Tuesday");
            break;
            case 3: System.out.print("wednesday");
            break;
            case 4: System.out.print("THUrsday");
            break;
            case 5: System.out.print("Friday");
            break;
            case 6: System.out.print("Saturday");
            break;
            case 7:System.out.print("Sunday");
            break;
            
        } 
    }
}
