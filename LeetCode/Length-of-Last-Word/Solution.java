1class Solution {
2    public int lengthOfLastWord(String s) {
3        int length=0;
4        boolean flag=true;
5        for(int i=s.length()-1;i>=0;i--){
6            char ch=s.charAt(i);
7            if(ch==' ' && flag) continue;
8            else if(ch==' ') break;
9            else{
10                length+=1;
11                flag=false;
12            }
13        }
14        return length;
15    }
16}