1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder result=new StringBuilder("");
4        int i=s.length()-1;
5        while(i>=0){
6            while(i>=0 && s.charAt(i)==' ') i--;
7            if(i<0) break;
8            int j=i;
9            while(j>=0 && s.charAt(j)!=' ') j--;
10            if(result.length()>0){
11                result.append(" ");
12            }
13            String word=s.substring(j+1,i+1);
14            result.append(word);
15            i=j;
16        }
17        return result.toString();
18    }
19}