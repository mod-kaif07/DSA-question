import java.util.Scanner;

public class halfpyramidnumber {

    public static void main(String arg[]){
     int n;
     Scanner sc =new Scanner(System.in);
     System.out.print("enter number");
     n=sc.nextInt();
      sc.close();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i>=j){
                System.out.print(j);
            }
            else{
                System.out.print(" ");
            }
        }System.out.println(" ");
      }
    }
}

