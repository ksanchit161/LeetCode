1class Solution {
2    public List<String> stringSequence(String target) {
3        List<String>answer=new ArrayList<>();
4        int i=0;
5        int j=0;
6        StringBuilder temp=new StringBuilder("");
7        while(i<target.length()){
8            char ch=(char)(97+j);
9            char ele=target.charAt(i);
10            StringBuilder ans=new StringBuilder(temp);
11            if(ch==ele){
12                i++;
13                j=0;
14                temp.append(ele);
15            }
16            else j++;
17            ans.append(ch);
18            answer.add(ans.toString()); 
19        }
20        return answer;
21    }
22}