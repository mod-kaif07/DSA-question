public class dulpicate {
    public static  String repeat(String str){
        StringBuilder s= new StringBuilder("");
        for(int i=0;i<str.length();i++){
            while(i<str.length()-1&&str.charAt(i)!=str.charAt(i+1)){
                 s.append(str.charAt(i));
                 i++;
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str="aaaabbbdeerreed";
        String answer= repeat(str);
        System.out.println(answer);
    }
}
