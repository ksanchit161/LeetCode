1class Solution {
2    public int maxProfit(int[] prices) {
3        int current=prices[0];
4        int n=prices.length;
5        int max=0;
6        for(int i=1;i<n;i++){
7            if(prices[i]>current){
8                if((prices[i]-current)>max) max=prices[i]-current;
9            }
10            else{
11                current=prices[i];
12            }
13        }
14        return max;
15    }
16}