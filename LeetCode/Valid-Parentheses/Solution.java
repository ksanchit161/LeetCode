1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack=new Stack<>();
4        int size=0;
5        for(char ch: s.toCharArray()){
6            if(ch=='(' || ch=='[' || ch=='{') {
7                size++;
8                stack.push(ch);
9            }
10            else if(size>0 && ch==')' && stack.peek()=='(') {
11                stack.pop();
12                size--;
13            }
14            else if(size>0 && ch==']' && stack.peek()=='[') {
15                stack.pop();
16                size--;
17            }
18            else if(size>0 && ch=='}' && stack.peek()=='{') {
19                stack.pop();
20                size--;
21            }
22            else return false;
23        }
24        return size==0;
25    }
26}