1class Solution {
2    public String getHint(String secret, String guess) {
3        char arr[]=secret.toCharArray();
4        char brr[]=guess.toCharArray();
5        int freq[]=new int[10];
6        int bulls=0;
7        int cows=0;
8        for(char ch:arr){
9            freq[ch-'0']++;
10        }
11        for(int i=0;i<brr.length;i++){
12            if(arr[i]==brr[i]) bulls++;
13            if(freq[brr[i]-'0']>0){
14                cows++;
15                freq[brr[i]-'0']--;
16            }
17        }
18        cows-=bulls;
19        var result=new StringBuilder("");
20        result.append(bulls);
21        result.append('A');
22        result.append(cows);
23        result.append('B');
24        return result.toString();
25    }
26}