1class Solution {
2    public int findNthDigit(int n) {
3        long len = 1;      
4        long count = 9;   
5        long start = 1;     
6        while (n > len * count) {
7            n -= len * count;
8            len++;
9            count *= 10;
10            start *= 10;
11        }
12        start += (n - 1) / len;
13        String s = Long.toString(start);
14        return s.charAt((int)((n - 1) % len)) - '0';
15    }
16
17}