1class Solution {
2    public int maxProfit(int[] prices) {
3        int max=0;
4        int curr=prices[0];
5        for(int i=1;i<prices.length;i++){
6            if(prices[i]>curr){
7                max=Math.max(max,prices[i]-curr);
8            }
9            else curr=prices[i];
10        }
11        return max;
12    }
13}