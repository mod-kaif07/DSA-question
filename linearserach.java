import java.util.*;

public class linearserach {
    public static int linearserach(int array[],int key){
        for(int i=0;i<array.length;i++){
             if(array[i]==key){
                return i;
             }
             
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size");
        int size= sc.nextInt();
        int []array=new int[size];
        System.err.print("enter"+size+"element");
        for(int i=0;i<size;i++){
            System.out.print("elenmets"+(i+1)+":");
            array[i]=sc.nextInt();
        }
        System.out.print("enter serach  key:");
        int key=sc.nextInt();
        sc.close();
            int answer=linearserach(array,key);
            if(answer==-1){
                System.out.print("invaid input");
            }
            else{
                System.out.print("index: "+answer);
            }
        
    }
}
