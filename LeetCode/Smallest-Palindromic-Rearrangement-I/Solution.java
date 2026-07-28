1class Solution {
2    public String smallestPalindrome(String s) {
3        if(s.length()==1) return s;
4        int arr[]=new int[26];
5        StringBuilder sb1=new StringBuilder("");
6        StringBuilder sb2=new StringBuilder("");
7        char mid='\0';
8        for(int i=0;i<s.length();i++){
9            int idx=s.charAt(i)-'a';
10            arr[idx]++;
11        }
12        for(int i=0;i<26;i++){
13            char ch=(char)(i+97);
14            while(arr[i]>=2){
15                sb1.append(ch);
16                sb2.append(ch);
17                arr[i]-=2;
18            }
19            if(arr[i]==1)mid=ch;
20        }
21        if(mid!='\0') sb1.append(mid);
22        sb1.append(sb2.reverse().toString());
23        return sb1.toString();
24
25    }
26}