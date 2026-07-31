1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder result=new StringBuilder("");
4        s=" "+s;
5        int i=s.length()-1;
6        while(i>=0){
7            if(s.charAt(i)==' ') i--;
8            else break;
9        }
10        int j=i;
11        while(j>=0 && i>=0){
12            char ch=s.charAt(j);
13            if(ch!=' ') j--;
14            else{
15                String word=s.substring(j+1,i+1);
16                result.append(word);
17                result.append(" ");
18                while( j>=0  &&  s.charAt(j)==' '){
19                    j--;
20                }
21                i=j;
22                j=i;
23            }
24        }
25        result.setLength(result.length()-1);
26        return result.toString();
27    }
28}