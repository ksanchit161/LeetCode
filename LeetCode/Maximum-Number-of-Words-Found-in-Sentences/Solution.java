1class Solution {
2    public int count_word(String s){
3        int count=1;
4        for(int j=0;j<s.length();j++){
5            if(s.charAt(j)==' ') count++;
6        }
7        return count;
8    }
9    public int mostWordsFound(String[] sentences) {
10        int max=-1;
11        for(int i=0;i<sentences.length;i++){
12            max=Math.max(max,count_word(sentences[i]));
13        }
14        return max;
15    }
16}