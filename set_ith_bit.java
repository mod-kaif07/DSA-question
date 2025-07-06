public class set_ith_bit {
    public static int setbit (int x,int i){
        int bitmask=1<<i;
       return x |bitmask;
    }
    public static void main(String args[]){
        System.out.print(setbit(10,0));
    }
}
