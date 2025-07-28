
public class table {
  public static void main(String arg[]){
   Scanner mc=new Scanner(System.in);
   System.out.println("enter number of table");
   int num = mc.nextInt();
   mc.close();
   for(int i=1;i<=10;i++){
      System.out.println(num*i);
   }
  }
    
}
