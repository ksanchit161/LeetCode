1class Solution {
2    public int[] diStringMatch(String s) {
3        int i=0;
4        int j=s.length();
5        int []result=new int [j+1];
6        int k=0;
7        char[] ch = s.toCharArray();
8
9        for(int l=0;l<ch.length;l++){
10            if(ch[l]=='I') result[k++]=i++;
11            else result[k++]=j--;
12        }
13        result[k]=i;
14        return result;
15    }
16}