1class Solution {
2    public static String removeOuterParentheses(String s) {
3        StringBuilder ans=new StringBuilder();
4        int count=0;
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(ch=='('){
8                if(count>0){
9                    ans.append(ch);
10                }
11                count++;
12            }
13            else{
14                count--;
15                if(count>0){
16                    ans.append(ch);
17                }
18            }
19        }
20        return ans.toString();
21    }
22}