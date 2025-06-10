import java.util.Scanner;

public class factfun {
    public static int factorial(int n){
        int answer=1;
 for(int i=1;i<=n;i++){
       answer=answer*i;
 }
 return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number ");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.print("factorial: "+fact);
    }
}
