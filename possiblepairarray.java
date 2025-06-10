import java.util.Scanner;

public class possiblepairarray {
    public static void reverse(int array[]){
     for(int i=0;i<array.length;i++){
        int current=array[i];
        for(int j=i+1;j<array.length;j++){
             System.out.print("("+current+","+array[j]+")");
        }
        System.out.println();
     }
    }
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
        System.out.print("enter size");
        int size=sc.nextInt();
       
       int[]array=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter "+i+" element");
            array[i]=sc.nextInt();
        }
        reverse(array);
    }
}
