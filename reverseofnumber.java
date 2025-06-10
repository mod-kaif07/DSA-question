public class reverseofnumber {
      public static void main(String arg[]){
      int a=115638827;
     while (a>0) {
        int lastdigit=a%10;
        System.out.print(lastdigit);
        a=a/10;
        
     }
 }
}
