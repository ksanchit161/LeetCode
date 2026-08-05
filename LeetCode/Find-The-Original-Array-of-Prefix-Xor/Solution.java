1class Solution {
2    public int[] findArray(int[] pref) {
3        int res[]=new int[pref.length];
4        res[0]=pref[0];
5        for(int i=1;i<pref.length;i++){
6            res[i]=pref[i-1]^pref[i];
7        }
8        return res;
9    }
10}