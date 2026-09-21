1class Solution {
2    public int countNumbersWithUniqueDigits(int n) {
3        if(n==0) return 1;
4        int ans=10;
5        int curr=9;
6        int avail=9;
7        for(int i=2;i<=n;i++){
8            curr*=avail;
9            ans+=curr;
10            avail--;
11        }
12    return ans;
13    }
14}