public class binary {
    public static void serach(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]== key){
                System.out.print("key found at:"+i);
                break;
            }
        }
    }
    public static void binarySearch(int num[],int key){
        int start=0;
        int end = num.length-1;

        while(start<= end){
                    int mid = (start+end)/2;
        
        if(key == num[mid]){
            System.out.print("key found at:"+mid );
              return;
        }
        if(key< num[mid] ){
            end= mid-1;
        }
        else{
            start= mid+1;
        }
            
    }
   System.out.print("key not found");
}
        
        
        
    }
	public static void main(String[] args) {
		int num[]={2,5,4,8,9,0};
		int key=0;
		Search(num,key);
	}

