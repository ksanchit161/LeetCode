class Solution {
    public int maxProfit(int[] prices) {
        int current=prices[0];
        int n=prices.length;
        int max=0;
        for(int i=1;i<n;i++){
            if(prices[i]>current){
                if((prices[i]-current)>max) max=prices[i]-current;
            }
            else{
                current=prices[i];
            }
        }
        return max;
    }
}