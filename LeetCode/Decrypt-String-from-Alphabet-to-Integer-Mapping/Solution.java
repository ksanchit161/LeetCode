1class Solution {
2    public String freqAlphabets(String s) {
3        char arr[]=s.toCharArray();
4        int len=s.length();
5        var result=new StringBuilder("");
6        int i=0;
7        int num;
8        while(i<len){
9            if (i+2<len && s.charAt(i+2)=='#'){
10            num=Integer.parseInt(s.substring(i,i+2));
11            result.append((char)(num+96));
12                i+=3;
13            }
14            else{
15                num=s.charAt(i)-'0';
16                result.append((char)(num+96));
17                i+=1;
18            }
19        }
20        return result.toString();
21    }
22}