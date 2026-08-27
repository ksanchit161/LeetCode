1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int max=-1;
4        for(int i=0;i<sentences.length;i++){
5            int count=1;
6            String sentence=sentences[i];
7            for(int j=0;j<sentence.length();j++){
8                if(sentence.charAt(j)==' ') count++;
9            }
10            max=Math.max(max,count);
11        }
12        return max;
13    }
14}