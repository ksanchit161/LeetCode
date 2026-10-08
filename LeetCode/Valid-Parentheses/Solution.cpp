1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack=new Stack<>();
4        for(char ch: s.toCharArray()){
5            if(ch=='(' || ch=='[' || ch=='{') stack.push(ch);
6            else if(stack.size()>0 && ch==')' && stack.peek()=='(') stack.pop();
7            else if(stack.size()>0 && ch==']' && stack.peek()=='[') stack.pop();
8            else if(stack.size()>0 && ch=='}' && stack.peek()=='{') stack.pop();
9            else return false;
10        }
11        return stack.size()==0;
12    }
13}