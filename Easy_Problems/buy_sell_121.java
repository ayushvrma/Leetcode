package Easy_Problems;

public class buy_sell_121 {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length;i++){
            if(prices[i]<minSoFar){
                minSoFar= prices[i];
                continue;
            }
            if(maxProfit<prices[i]-minSoFar)
            {
                maxProfit = prices[i]-minSoFar;
                continue;
            }
        }
        return maxProfit;
    }
}
