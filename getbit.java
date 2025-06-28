public class getbit {
    public static int getbit(int x, int i){
        int bitMask=1<<i;
        if((x & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }


    }
    public static void main(String args[]){
        System.out.print(getbit(10,1));
    }
}
