1class Solution {
2    public int maxDistinct(String s) {
3        int count=0;
4        boolean arr[]=new boolean[26];
5        for(int i=0;i<s.length();i++){
6            int idx=(int)(s.charAt(i)-'a');
7            if(arr[idx]) continue;
8            arr[idx]=true;
9            count+=1;
10        }
11       
12      
13        return count;
14    }
15}