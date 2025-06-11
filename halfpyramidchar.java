import java.util.Scanner;

public class halfpyramidchar {
    public static void main(String arg[]){
     int n;
     Scanner sc =new Scanner(System.in);
     System.out.print("enter number");
     n=sc.nextInt();
      sc.close();
      char a='A';
      int k=1;
      for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
            if(i>=j){
                // System.out.print(a);
                // a++;
                System.out.print(" "+k);
                k++;
            }
            else{
                System.out.print(" ");
            }
        }System.out.println(" ");
      }
    }
}
