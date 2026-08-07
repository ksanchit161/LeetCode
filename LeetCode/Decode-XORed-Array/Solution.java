1class Solution {
2    public int[] decode(int[] encoded, int first) {
3       
4        int result[]=new int[encoded.length+1];
5        result[0]=first;
6        for(int i=0;i<encoded.length;i++){
7            result[i+1]=encoded[i]^result[i];
8        }
9        return result;
10    }
11}