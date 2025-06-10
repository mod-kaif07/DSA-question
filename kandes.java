public class kandes {
    public static void kandes(int array[]){
    int current=0;
    int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            current=current+array[i];
         if(current<0){
            current=0;
         }
          maxsum=Math.max(maxsum, current);
        }
        System.out.print("max sum="+maxsum);
    }
    public static void main(String args[]){
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        kandes(array);
    }
}
