1class Solution {
2
3    public int uniqueMorseRepresentations(String[] words) {
4        String[] code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
5        HashSet<String>result=new HashSet<>();
6        for(int i=0;i<words.length;i++){
7            StringBuilder ans=new StringBuilder("");
8            for(int j=0;j<words[i].length();j++){
9                char ch=words[i].charAt(j);
10                ans.append(code[ch-'a']);
11            }
12            result.add(ans.toString());
13        }
14        return result.size();
15    }
16}