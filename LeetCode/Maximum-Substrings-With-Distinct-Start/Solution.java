1class Solution {
2    public int maxDistinct(String s) {
3        boolean arr[]=new boolean[26];
4        for(int i=0;i<s.length();i++){
5            int idx=(int)(s.charAt(i)-'a');
6            arr[idx]=true;
7        }
8        int count=0;
9        for(int i=0;i<26;i++){
10            if(arr[i]) count+=1;
11        }
12        return count;
13    }
14}