1class Solution {
2    public int maxProfit(int[] prices) {
3        int max=0;
4        int current=prices[0];
5        for(int i=1;i<prices.length;i++){
6            if((prices[i]-current)>0){
7                max=Math.max(prices[i]-current,max);
8            }
9            else{
10                current=prices[i];
11            }
12        }
13        return max;
14    }
15}