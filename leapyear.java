import java.util.Scanner;

public class leapyear {
    public static void main(String arg[]){
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter Number");
        int year=scanner.nextInt();
        if(year%4!=0){
            System.out.print(" not leap year");
            
        }  else if(year%4==0){
            if(year%100!=0){
                System.out.print("leap yaer");
            }
            if(year%100==0){
             if(year%400==0){
                System.out.print("leap year ");
            }else{
                System.out.print("Not leap year");
            } 
          }
        }
    }
}
