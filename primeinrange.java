public class primeinrange {





    public static boolean isprime(int  n){
        boolean isprime= true;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                isprime= false;
                break;
            }
        }
        return  isprime;
    }

    public static void prime_range(int a){
      
        for(int i=2;i<=a;i++){
          if(isprime(i)){
            System.out.println(" "+i);
          }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int a=100000;
        prime_range(a);
        //System.out.println("prime no are "+is_range);
    }
}
