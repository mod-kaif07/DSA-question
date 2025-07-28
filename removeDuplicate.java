

public class removeDuplicate {
    public static int removeduplicate(int arr[]){
       int countelement=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[countelement]=arr[i];
                countelement++;
            }
            
        }
        return countelement;
    }
    public static void main(String[] args) {
       int removearr[]={0,1,1,1,2,2,3};
       int answerremove=removeduplicate(removearr);
       System.err.println(answerremove);
       
       for(int i=0;i<answerremove;i++){
        System.out.print(removearr[i]+" ");
       }

    }
}
