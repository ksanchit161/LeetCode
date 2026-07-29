1class Solution {
2    public List<Integer> findWordsContaining(String[] words, char x) {
3        var result= new ArrayList<Integer>();
4        for(int i=0;i<words.length;i++){
5            if(words[i].indexOf(x)!=-1) result.add(i);
6        }
7        return result;
8    }
9}