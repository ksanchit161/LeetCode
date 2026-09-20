1class Solution {
2    public int reverseDegree(String s) {
3        char arr[]=s.toCharArray();
4        int ans=0;
5        for(int i=0;i<arr.length;i++){
6            char ch=arr[i];
7            int idx=26-(int)(ch-'a');
8            ans+=((i+1)*idx);
9        }
10        return ans;
11    }
12}