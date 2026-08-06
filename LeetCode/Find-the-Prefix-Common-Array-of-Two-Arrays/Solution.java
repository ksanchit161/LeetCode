1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int result[]=new int [A.length];
4        int count[]=new int [51];
5        int common=0;
6        for(int i=0;i<A.length;i++){
7            if(++count[A[i]]==2) common++; 
8            if(++count[B[i]]==2) common++;
9            result[i]=common;
10        }
11        return result;
12    }
13}
14/* first increment then check we check 2 because it is permutation so , it will occur once in each array , max count=2 */