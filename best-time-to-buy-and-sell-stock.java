//https://leetcode.com/problems/best-time-to-buy-and-sell-stock
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1)
            return 0;
        int minindex=0;
        int maxindex=1;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if((prices[maxindex]-prices[minindex])>profit && (minindex<maxindex))                            {   profit = prices[maxindex]-prices[minindex];
                     }
            if(prices[i]<prices[minindex]){
                minindex=i;
                if( maxindex<prices.length-1)
                maxindex = minindex +1;
            }
            else if(maxindex<prices.length-1)
                maxindex++;    
        }
        return profit;
    }
}