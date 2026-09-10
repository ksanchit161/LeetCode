1class Solution {
2    public int largestAltitude(int[] gain) {
3       int max=0;
4       int val=0;
5       for(int ele: gain){
6        val+=ele;
7        max=Math.max(max,val);
8       } 
9       return max;
10    }
11}