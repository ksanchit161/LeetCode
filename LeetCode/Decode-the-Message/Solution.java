1class Solution {
2    public String decodeMessage(String key, String message) {
3        char arr[]=new char[26];
4        int count=0;
5        for(int i=0;i<key.length() && count<26;i++){
6            if(key.charAt(i)==' ') continue;
7            int idx=(int)(key.charAt(i)-'a');
8            if(arr[idx]=='\0') {
9                arr[idx]=(char)(count+'a');
10                count++;
11            }
12        }
13        var result=new StringBuilder("");
14        for(int i=0;i<message.length();i++){
15            if(message.charAt(i)==' ') result.append(' ');
16            else{
17                result.append(arr[message.charAt(i)-'a']);
18            }
19        }
20        return result.toString();
21
22    }
23}