1class Solution {
2    public int countConsistentStrings(String allowed, String[] words) {
3        boolean seen[]=new boolean[26];
4        for(int i=0;i<allowed.length();i++){
5            seen[allowed.charAt(i)-'a']=true;
6        }
7        int count=0;
8        for(int i=0;i<words.length;i++){
9            boolean flag=true;
10            for(int j=0;j<words[i].length();j++){
11                if(seen[words[i].charAt(j)-'a']==false){
12                    flag=false;
13                    break;
14                }
15            }
16                if(flag) count++;
17        }
18        return count;
19    }
20}