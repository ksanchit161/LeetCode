1class Solution {
2    public String reversePrefix(String s, int k) {
3        char [] arr=s.toCharArray();
4        int i=0;
5        int j=k-1;
6        while(i<=j){
7            char temp=arr[i];
8            arr[i]=arr[j];
9            arr[j]=temp;
10            i++;
11            j--;
12        }
13        return String.valueOf(arr);
14    }
15}