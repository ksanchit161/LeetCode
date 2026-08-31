1class Solution {
2    public List<String> commonChars(String[] words) {
3        List<String>result=new ArrayList<>();
4        int []freq=new int[26];
5        int []freq2=new int [26];
6        for(int i=0;i<words[0].length();i++){
7            char ch=words[0].charAt(i);
8            freq[ch-'a']++;
9        }
10        for(int i=1;i<words.length;i++){
11            Arrays.fill(freq2, 0);
12            for(int j=0;j<words[i].length();j++){
13                char ch=words[i].charAt(j);
14                freq2[ch-'a']++;
15            }
16            for(int k=0;k<26;k++){
17               freq[k]=Math.min(freq[k],freq2[k]);
18            }
19        }
20        for(int i=0;i<26;i++){
21            if (freq[i] > 0) {
22            result.addAll(Collections.nCopies(freq[i], String.valueOf((char)(i + 'a'))));
23            }
24        }
25        return result;
26    }
27}