1class Solution {
2    public int minBitFlips(int start, int goal) {
3        int result=0;
4        while(goal>0 || start>0){
5            int desired=goal&1;
6            if((start&1)!=desired) result++;
7            goal>>=1;
8            start>>=1;
9        }
10        return result;
11    }
12}