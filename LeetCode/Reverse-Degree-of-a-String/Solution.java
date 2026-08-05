1class Solution {
2    public int reverseDegree(String s) {
3        char []arr=s.toCharArray();
4        int sum=0;
5        for(int i=0;i<arr.length;i++){
6            int idx=(int)(arr[i]-'a');
7            int prod=(i+1)*(26-idx);
8            sum+=prod;
9        }
10        return sum;
11    }
12}