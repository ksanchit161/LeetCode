1class Solution {
2        static{
3        for(int i = 0; i < 1000; i++){
4            checkInclusion("a","a");
5        }
6    }
7
8
9
10
11    public static  boolean comp(int arr[],int brr[]){
12        for(int i=0;i<26;i++){
13            if(arr[i]!=brr[i]) return false;
14        }
15        return true;
16    }
17
18    public static  boolean checkInclusion(String s1, String s2) {
19        int freq[]=new int[26];
20        for(int i=0;i<s1.length();i++){
21            int idx=(int)(s1.charAt(i)-'a');
22            freq[idx]++;
23        }
24
25        if(s1.length()>s2.length()) return false;
26
27        int i=0;
28        int j=s1.length();
29        int window[]=new int[26];
30        for(i=0;i<j;i++){
31            int index=(int)(s2.charAt(i)-'a');
32            window[index]++;
33        }
34        if(comp(freq,window)) return true;
35
36        else{
37          while(i<s2.length()){
38            int idx=(int)(s2.charAt(i)-'a');
39            window[idx]++;
40          window[(s2.charAt(i - s1.length()) - 'a')]--;
41            if(comp(freq,window)) return true;
42            i++;
43          }      
44        }
45        return false;
46    }
47}