import java.util.*;

public class bionomialcoffifun {
    public static long fact(int n){
          long factorial=1;
          for(int i=1;i<=n;i++){
            factorial=factorial*i;
          }
          return factorial;
    }
    public static long bionomialcoffi(int n,int m){
                long  a= fact(n);
                long b=fact(m);
                long c=fact(n-m);
               return(a/(b*c));
                
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n : ");
        int n= sc.nextInt();
        System.out.print(" enter r :");
        int m= sc.nextInt();
        long bionimial_cofficient =bionomialcoffi(n,m);
        System.out.print("bionomial cofficient :"+bionimial_cofficient);
}
}