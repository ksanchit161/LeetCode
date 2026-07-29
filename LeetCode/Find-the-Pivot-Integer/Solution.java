1class Solution {
2    public int pivotInteger(int n) {
3        int left=0;
4        int total=n*(n+1)/2;
5        for(int i=1;i<=n;i++){
6           left+=i;
7           if(left==(total-left+i)) return i;
8        }
9        return -1;
10    }
11}