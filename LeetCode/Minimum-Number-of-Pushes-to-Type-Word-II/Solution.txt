1class Solution {
2    public int minimumPushes(String word) {
3        int freq[]=new int[26];
4        for(int i=0;i<word.length();i++){
5            int idx=(int)(word.charAt(i)-'a');
6            freq[idx]+=1;
7        }
8        Arrays.sort(freq);
9        int count=0;
10        int ans=0;
11        for(int i=0;i<26;i++){
12            if(freq[25-i]==0) break;
13            int mul=count/8 +1;
14            ans+=freq[25-i]*mul;
15            count++;
16        }
17       
18        return ans;
19    }
20}