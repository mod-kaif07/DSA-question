public class countthelowercase {
    public  static  void  count_lowercase(String str){
        int lowercase=0;
        int uppercase=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                lowercase++;
            }
            if(Character.isUpperCase(str.charAt(i))){
                uppercase++;
            }
        }
        System.out.println("Uppercase: " + uppercase);
        System.out.println("lowerlowercase: " +lowercase);
        
    }
    public static void main(String[] args) {
        String str= "My name is Kaif, i am the student of Ece branch,"; 
        // from faculty of engineerring  and tehnology fron,
        //  Gurukul kangari unvirsity";
         count_lowercase(str);
        //  System.out.println(count);
    }
}
