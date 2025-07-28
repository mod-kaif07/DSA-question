
import java.util.Arrays;

public class anagram {
    public  static  String anagram(String st1,String st2){
       if(st1.length()!=st2.length()){
        return "Not anagram";
       }
       char[] arr1= st1.toCharArray();
       char[] arr2= st2.toCharArray();
       Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            return  "anagram";
        }else{
            return "Not anagram";
        }
       
    }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        String answer= anagram(str1,str2);
        System.out.println(answer);
        
    }
}
