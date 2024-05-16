package leetCode;



public class BestTimeToBuyAndSellStockOne {

    public static int checkBestTime(int[] prices) {
        int profit = 0;
        int buy = 0;
        int firstCount = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < prices[++firstCount]){
                buy = prices[i];

                int sell = 0;
                for(int j = firstCount; j < prices.length; j++){
                    if(prices[j] > sell){
                        sell = prices[j];
                    }
                }
              profit = sell - buy;
                break;
            }
            if(firstCount == prices.length - 1)
                break;
            firstCount++;

        }
        return profit;
    }
}
