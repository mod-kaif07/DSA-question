import java.util.Scanner;

public class halfpyramidstar {
    public static void main(String arg[]){
     int n;
     Scanner sc =new Scanner(System.in);
     System.out.print("enter number");
     n=sc.nextInt();
      sc.close();
      for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
            if(i>=j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }System.out.println(" ");
      }
    }
}