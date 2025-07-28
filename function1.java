public class function1 {
    public static  int  average(float a ,float b,float c){
         float d=a+b+c;
         return (int)d/3;
    }
    public static void main(String args[]){
        float a=3;
        float b=4;
        float c=7;
        float answer=average (a,b,c);
        System.out.print("average is :"+answer);
    }
}
