1class Solution {
2       static {
3        for (int i = 0; i<300; i++) {
4            removeOuterParentheses("()");
5        }
6    }
7    public static String removeOuterParentheses(String s) {
8        var ans=new StringBuilder("");
9        int open=0;
10        for(char ch : s.toCharArray()){
11            if(ch=='(' && open>=1) {
12                ans.append('(');
13                open++;
14            }
15            else if(ch=='(') open++;
16            else if(ch==')' && open>1) {
17                ans.append(ch);
18                open--;
19            }
20            else if(ch==')' && open==1) open--;
21        }
22        return ans.toString();
23    }
24}