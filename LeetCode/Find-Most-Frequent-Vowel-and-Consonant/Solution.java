1class Solution {
2    public int maxFreqSum(String s) {
3        int max1=0;
4        int max2=0;
5        char brr[]=s.toCharArray();
6        int arr[]=new int [26];
7        for(int i=0;i<brr.length;i++){
8            int idx=(int) (brr[i]-'a');
9            char ch=brr[i];
10            arr[idx]++;
11            if(arr[idx]>max1 && "aeiouAEIOU".indexOf(ch) == -1) max1=arr[idx];
12            else if(arr[idx]>max2 && "aeiouAEIOU".indexOf(ch) != -1) max2=arr[idx];
13        }
14        return max1+max2;
15    }
16}