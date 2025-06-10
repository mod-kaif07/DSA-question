public class buy_sellstokes {

    public static int profit(int price[]){
       int buyprice=Integer.MAX_VALUE;
       int n= price.length;
       int max_profit=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        if(buyprice<price[i]){
               int profit = price[i]-buyprice;
               max_profit=Math.max(max_profit, profit);
        }
        else{
            buyprice=price[i];
        }
       }

return max_profit;
    }
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        int max_profit=profit(price); 
        System.out.print("max profit="+max_profit);
    }
}
