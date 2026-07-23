1class Solution {
2    public int[] numberOfLines(int[] widths, String s) {
3        int []result=new int [2];
4        int lines=0;
5        int width=0;
6        for(int i=0;i<s.length();i++){
7            int len=widths[s.charAt(i)-'a'];
8            if((width+len)<=100) width+=len;
9            else{
10                lines+=1;
11                width=len;
12            }
13
14        }
15        if(width>0) lines+=1;
16        result[0]=lines;
17        result[1]=width;
18        return result;
19    }
20}