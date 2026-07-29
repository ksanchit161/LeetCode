1class Solution {
2    public int scoreOfString(String s) {
3    int sum=0;
4    for(int i=0;i<s.length()-1;i++){
5        int val= (char) s.charAt(i);
6        int val1=(char) s.charAt(i+1) ;
7        sum+=Math.abs(val1-val);
8    }
9    return sum;
10    }
11}