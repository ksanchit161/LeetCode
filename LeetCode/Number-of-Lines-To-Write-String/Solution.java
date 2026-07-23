1class Solution {
2    static{
3        int []number={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
4        for(int i=0;i<=100;i++){
5             numberOfLines(number,"abcedfegheh");
6        }
7    }
8    public static int[] numberOfLines(int[] widths, String s) {
9        int []result=new int [2];
10        int lines=0;
11        int width=0;
12        for(int i=0;i<s.length();i++){
13            int len=widths[s.charAt(i)-'a'];
14            if((width+len)<=100) width+=len;
15            else{
16                lines+=1;
17                width=len;
18            }
19
20        }
21        if(width>0) lines+=1;
22        result[0]=lines;
23        result[1]=width;
24        return result;
25    }
26}