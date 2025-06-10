import java.util.Scanner;

public class decimaltobinary {

    public static void binary(int n){
        int num=0;
        int pow=0;
            while(n>0){
                int digit= n%2;
                num=num+(digit*(int )Math.pow(10,pow));
                pow++;
                n=n/2;
 
            } System.out.print("Binary num :"+num);
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Decimal number");
        int n=sc.nextInt();
        sc.close();
       binary(n);
         
    }
    
}
