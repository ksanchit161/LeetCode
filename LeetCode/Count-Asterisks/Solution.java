1class Solution {
2    public int countAsterisks(String s) {
3        int count=0;
4        int ans=0;
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(ch=='|') count++;
8            else if(count%2==0 && ch=='*') ans++;
9        }
10        return ans;
11    }
12}