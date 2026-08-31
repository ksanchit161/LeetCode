1class Solution {
2    public List<String> commonChars(String[] words) {
3        List<String>result=new ArrayList<>();
4        int []freq=new int[26];
5        for(int i=0;i<words[0].length();i++){
6            char ch=words[0].charAt(i);
7            freq[ch-'a']++;
8        }
9        for(int i=1;i<words.length;i++){
10            int []freq2=new int [26];
11            for(int j=0;j<words[i].length();j++){
12                char ch=words[i].charAt(j);
13                freq2[ch-'a']++;
14            }
15            for(int k=0;k<26;k++){
16               freq[k]=Math.min(freq[k],freq2[k]);
17            }
18        }
19        for(int i=0;i<26;i++){
20            if (freq[i] > 0) {
21            result.addAll(Collections.nCopies(freq[i], String.valueOf((char)(i + 'a'))));
22            }
23        }
24        return result;
25    }
26}