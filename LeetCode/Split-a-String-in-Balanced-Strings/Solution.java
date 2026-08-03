1class Solution {
2    public int balancedStringSplit(String s) {
3        int r=0;// no of r
4        int l=0; // no of l
5        int result=0;
6        int i=0;
7        while(i<s.length()){
8            if(s.charAt(i)=='R') r++;
9            else l++;
10            if(r==l){
11                result+=1;
12                r=0;
13                l=0;
14            }
15            i++;
16        }
17        return result;
18    }
19}