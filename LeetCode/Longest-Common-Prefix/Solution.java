1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        int n=strs.length;
4        String word1=strs[0],prefix;
5        int m=word1.length();
6        int i=1;
7        String ans="",word;
8        if(n==1) return word1;
9        while(i<m+1){
10            prefix=word1.substring(0,i);
11            for(int j=1;j<n;j++){
12                word=strs[j];
13                if(! word.startsWith(prefix)) return ans;
14            }
15            ans+=word1.charAt(i-1);
16            i++;
17        }
18        return ans;
19    }
20}