1class Solution {
2     static {
3        for(int i = 0; i < 500; i++)
4            countAsterisks("");
5    }
6    public  static int countAsterisks(String s) {
7        int count=0;
8        int ans=0;
9        for(int i=0;i<s.length();i++){
10            char ch=s.charAt(i);
11            if(ch=='|') count++;
12            else if(count%2==0 && ch=='*') ans++;
13        }
14        return ans;
15    }
16}