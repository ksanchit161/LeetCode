1class Solution {
2    public int findClosest(int x, int y, int z) {
3        int d1=z-x;
4        int d2=z-y;
5        if(d1<0) d1*=-1;
6        if(d2<0) d2*=-1;
7        if(d1==d2) return 0;
8        else if(d1<d2) return 1;
9        else return 2;
10
11    }
12}