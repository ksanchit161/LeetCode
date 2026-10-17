class Solution {
    public int arrangeCoins(int n) {
        int req=1;
        int ans=0;
        while(n>0){
            if(n<req) break;
            else{
                n-=req;
                ans+=1;
                req++;
            }
        }
        return ans;
    }
}