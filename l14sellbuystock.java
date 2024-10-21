public class l14sellbuystock {
    public static void sellbuy(int prices[]){
        int buy[]=new int[prices.length];
        buy[0]=prices[0];
        for(int i=1;i<prices.length;i++){
            buy[i]=Math.min(prices[i],buy[i-1]);
        }
        int sell[]=new int[prices.length];
        sell[0]=prices[0];
        for(int i=1;i<prices.length;i++){
            sell[i]=Math.max(prices[i],sell[i-1]); 
        }
        System.out.println("buying price = "+ buy[prices.length-1]+"selling price="+sell[prices.length-1]);
        int profit=sell[prices.length-1]-buy[prices.length-1];
        System.out.println("profit= "+profit);
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        sellbuy(prices);
    }
}
