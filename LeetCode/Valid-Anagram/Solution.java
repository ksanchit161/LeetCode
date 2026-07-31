1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int []arr= new int[26];
4        int len=s.length();
5        int len1=t.length();
6        if(len!=len1) return false;
7        for(int i=0;i<len;i++){
8            int index1=s.charAt(i) - 'a';
9            int index2=t.charAt(i) - 'a';
10            arr[index1]+=1;
11            arr[index2]-=1;
12        }
13        for(int i=0;i<26;i++){
14            if(arr[i]!=0) return false;
15        }
16        return true;
17    }
18}