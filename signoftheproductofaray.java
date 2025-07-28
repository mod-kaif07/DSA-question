public class signoftheproductofaray {
    public static void main(String[] args) {
        int nums[]={-1,-2,-3,-4,3,2,1};
       int answer= sigproduct(nums);
       if(answer>0){
        System.out.print(1);
       }
       else if(answer<0){
        System.out.print(-1);
       }
       else{
        System.out.println(0);
       }
    }
    public static int sigproduct(int n[]){
        int product=1;
            for(int i=0;i<n.length;i++){
                product= n[i]*product;
            }
            return product;
    }
}
