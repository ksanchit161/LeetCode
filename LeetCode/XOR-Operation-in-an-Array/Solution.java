1class Solution {
2    public int xorOperation(int n, int start) {
3        int result=start;
4        for(int i=1;i<n;i++){
5            result^=(start+(2*i));
6        }
7        return result;
8    }
9}