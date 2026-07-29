1class Solution {
2    public int[] diStringMatch(String s) {
3        int i=0;
4        int j=s.length();
5        int []result=new int [j+1];
6        int k=0;
7        for(int l=0;l<s.length();l++){
8            if(s.charAt(l)=='I') result[k++]=i++;
9            else result[k++]=j--;
10        }
11        result[k]=i;
12        return result;
13    }
14}