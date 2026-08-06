1class Solution {
2    public String interpret(String command) {
3        var result=new StringBuilder("");
4        int i=0;
5        while(i<command.length()){
6            char curr=command.charAt(i);
7            if(curr=='G') result.append('G');
8            else if(command.charAt(i+1)==')'){
9                result.append('o');
10                i++;
11            }
12            else{
13                result.append("al");
14                i+=3;
15            }
16            i++;
17        }
18        return result.toString();
19    }
20}