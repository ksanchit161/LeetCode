1class Solution {
2    public int findClosest(int x, int y, int z) {
3        int d1=Math.abs(z-x);
4        int d2=Math.abs(z-y);
5        if(d1==d2) return 0;
6        else if(d1<d2) return 1;
7        else return 2;
8
9    }
10}