1class Solution {
2    public int findPermutationDifference(String s, String t) {
3        int result=0;
4        int index[]=new int[26];
5        int k=0;
6        for(int ele:s.toCharArray()){
7            index[ele-'a']=k++;
8        }
9        for(int i=0;i<t.length();i++){
10            int idx=(int)(t.charAt(i)-'a');
11            result+=Math.abs(index[idx]-i);
12        }
13        return result;
14    }
15}