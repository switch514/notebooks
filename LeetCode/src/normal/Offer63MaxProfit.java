package normal;

public class Offer63MaxProfit {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int low =Integer.MAX_VALUE;
        for(int i=0; i<prices.length;i++){
            int cur = prices[i];
            if(cur<=low){
                low = cur;
            }
            if(cur > low){
                maxProfit = Math.max(cur-low, maxProfit);
            }
        }


        return maxProfit;
    }
}
