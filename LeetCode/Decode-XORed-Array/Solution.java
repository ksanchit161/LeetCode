1class Solution {
2    public int[] decode(int[] encoded, int first) {
3        int result[]=new int[encoded.length+1];
4        result[0]=first;
5        for(int i=0;i<encoded.length;i++){
6            result[i+1]=encoded[i]^result[i];
7        }
8        return result;
9    }
10}