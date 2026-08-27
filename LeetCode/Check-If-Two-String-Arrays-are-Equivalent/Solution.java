1class Solution {
2    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
3        var word_1=new StringBuilder("");
4        var word_2=new StringBuilder("");
5        for(int i=0;i<word1.length;i++){
6            word_1.append(word1[i]);
7        }
8        for(int i=0;i<word2.length;i++){
9            word_2.append(word2[i]);
10        }
11
12        return word_1.toString().equals(word_2.toString());
13    }
14}