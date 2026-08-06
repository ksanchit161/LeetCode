1class Solution {
2    public boolean comp(int arr[],int brr[]){
3        for(int i=0;i<26;i++){
4            if(arr[i]!=brr[i]) return false;
5        }
6        return true;
7    }
8
9    public boolean checkInclusion(String s1, String s2) {
10        int freq[]=new int[26];
11        for(int i=0;i<s1.length();i++){
12            int idx=(int)(s1.charAt(i)-'a');
13            freq[idx]++;
14        }
15
16        if(s1.length()>s2.length()) return false;
17
18        int i=0;
19        int j=s1.length();
20        int window[]=new int[26];
21        for(i=0;i<j;i++){
22            int index=(int)(s2.charAt(i)-'a');
23            window[index]++;
24        }
25        if(comp(freq,window)) return true;
26
27        else{
28          while(i<s2.length()){
29            int idx=(int)(s2.charAt(i)-'a');
30            window[idx]++;
31          window[(s2.charAt(i - s1.length()) - 'a')]--;
32            if(comp(freq,window)) return true;
33            i++;
34          }      
35        }
36        return false;
37    }
38}