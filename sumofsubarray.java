public class sumofsubarray {
//this lgorithum having time comlexbity is B(n2).
    public static void reverse(int array[]){
        int prefix[]= new int[array.length];
         prefix[0]=array[0];
         int current=0;
         int maxsum=Integer.MIN_VALUE;
        for(int i=1;i<prefix.length;i++){
           prefix[i]=prefix[i-1]+array[i];
          
        }
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
               current= i==0? prefix[j]:prefix[j]-prefix[i-1];
               System.out.println(current);
            }
            if(current>maxsum){
                maxsum=current;
            }
           
            } System.out.print("max sum "+maxsum);
        }
    public static void main(String args[]){
       int array[]={1,-2,6,-1,3};
       reverse(array);
    }

}