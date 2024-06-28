class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;

        int mini = prices[0];
        for(int i = 1; i < n; i++){
            int cost = prices[i] - mini;
            maxProfit = Math.max(cost, maxProfit);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }
}


Solution 2
class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;  // least so far
        int pist = 0;  // profit if sold today
        int overall_profit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(pist > overall_profit){
                overall_profit = pist;
            }
        }
        return overall_profit;
    }
}
