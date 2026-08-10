1class Solution {
2    public int mySqrt(int x) {
3        int start=0;
4        int end=x;
5        int mid=start+(end-start)/2;
6        long sqr;
7        while(start<=end){
8            sqr= (long)mid*mid;
9            if(sqr==x) return mid;
10            else if(sqr>x) end=mid-1;
11            else start=mid+1;
12            mid=start+(end-start)/2;
13        }
14        return end;
15    }
16}