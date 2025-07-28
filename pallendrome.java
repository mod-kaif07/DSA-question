public class pallendrome {
    public static String pallendrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                //str.charAt(str.length()-1-i is mein -i use hua kyu ki 
                //last sai value ko change karne key liye 
                return "pallendrome";
            }

        }
        return  "Not pallendrome";
    }
    public static void main(String[] args) {
    String str= "kaif";
    String anser= pallendrome(str);
    System.out.println(anser);
    }
}
