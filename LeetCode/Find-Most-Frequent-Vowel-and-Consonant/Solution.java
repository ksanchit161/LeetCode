1class Solution {
2    public int maxFreqSum(String s) {
3        int max1=0;
4        int max2=0;
5        char brr[]=s.toCharArray();
6        int arr[]=new int [26];
7        for(int i=0;i<brr.length;i++){
8          arr[brr[i]-'a']++;
9        }
10        for(int i=0;i<26;i++){
11            if(i==0 || i==4 || i==8 || i==14 || i==20) max1=Math.max(max1,arr[i]);
12            else max2=Math.max(max2,arr[i]);
13        }
14        return max1+max2;
15    }
16}