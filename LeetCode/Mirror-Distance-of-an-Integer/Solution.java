1class Solution {
2    public int mirrorDistance(int n) {
3        int temp=n;
4        int reverse=0;
5        while(temp>0){
6            int last=temp%10;
7            reverse=reverse*10+last;
8            temp/=10;
9        }
10        return Math.abs(reverse-n);
11    }
12}