1class Solution {
2    public boolean rotateString(String s, String goal) {
3        StringBuilder temp=new StringBuilder(s);
4        for(int i=0;i<s.length();i++){
5            char ch=temp.charAt(0);
6            temp.deleteCharAt(0);
7            temp.append(ch);
8            if(temp.toString().equals(goal)) return true;
9        }
10        return false;
11    }
12}