public class shortlest_route {
    public static float  path(String str){
        int x=0;int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }
                else if(str.charAt(i)== 'S'){
                    y--;
                }
                else if(str.charAt(i)== 'W'){
                    x--;
                }
                else{
                    x++;
                }
              
        }
        float value= (float)Math.sqrt(x*x+y*y);
        return value;
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        float short_path=path(str);
        System.out.println(short_path);
    } 
}
