public class arraypratice1 {
    public static boolean reverse(int array[]){
        int n=array.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    
                  return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int array[]={1,1,1,3,3,4,3,2,4,2};
        boolean answer=reverse(array);
        System.err.print(answer);
    }
}
