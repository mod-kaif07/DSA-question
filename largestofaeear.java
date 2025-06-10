import java.util.Scanner;

public class largestofaeear {

    public static int largestarray(int array[]) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
            if(array[i]< smallest){
                smallest=array[i];
            }

        }
        System.out.println("smallest num :"+smallest);
        return largest;
    }
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size");
        int size= sc.nextInt();
        int []array=new int[size];
          for(int i=0;i<size;i++){
            System.out.print("elenmets"+(i+1)+":");
            array[i]=sc.nextInt();
        }
        int answer=largestarray(array);
        System.out.print("largest num :"+answer);
}
}
