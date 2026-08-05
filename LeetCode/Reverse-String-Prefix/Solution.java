1class Solution {
2    public String reversePrefix(String s, int k) {
3        var temp=new StringBuilder("");
4        temp.append(s.substring(0,k));
5        temp.reverse();
6        temp.append(s.substring(k,s.length()));
7        return temp.toString();
8    }
9}