1class Solution {
2    public int minimumPushes(String word) {
3       int n=word.length();
4       if(n<=8) return n;
5       else if(n<=16) return 8+(n-8)*2;
6       else if(n<=24) {
7        return 24+(n-16)*3;
8       }
9       else return (n-24)*4+48;
10    }
11}