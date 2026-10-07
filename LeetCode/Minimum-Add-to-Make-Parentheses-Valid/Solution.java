1class Solution {
2    public int minAddToMakeValid(String s) {
3        // int open=0;
4        // int ans=0;
5        // for(char ch:s.toCharArray()){
6        //     if(ch=='(') open++;
7        //     else if(ch==')' && open>0) open--;
8        //     else if(ch==')') ans++;
9        // }
10        // return Math.abs(open)+ans;
11        
12        int ans=0;
13        Stack<Integer> stack=new Stack<>();
14        for(char ch:s.toCharArray()){
15            if(ch=='(') stack.push(0);
16            else if(ch==')' && stack.size()>0) stack.pop();
17            else if(ch==')') ans++;
18        }
19        return stack.size()+ans;
20
21    }
22}
23
24