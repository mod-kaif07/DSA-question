public class tappedwater {
public static void tappedwater(int array[]){
  
  
    int n= array.length;
    int left_max[]=new int [n];
    int right_max[]=new int [n];
    left_max[0]= array[0];
        for(int i=1;i<n;i++){
        left_max[i]=Math.max(left_max[i-1],array[i]);

          } 
          right_max[n-1]=array[n-1];
          for(int i= n-2;i>=0;i--){
            right_max[i]=Math.max(right_max[i+1],array[i]);
          }
          int tappedwater=0;
          for(int i=0;i<n;i++){
             int water_level=Math.min(left_max[i],right_max[i]);
              tappedwater+=water_level-array[i];
          }
          System.out.print("tapped water"+tappedwater);
          

} 
  

    public static void main(String args[]){
        int array[]={4,2,0,6,3,2,5};
        tappedwater(array);
    }
}
