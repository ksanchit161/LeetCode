1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int ans=0;
4        for(int i=0;i<jewels.length();i++){
5            char ch=jewels.charAt(i);
6            for(int j=0;j<stones.length();j++){
7                char ch2=stones.charAt(j);
8                if(ch==ch2) ans++;
9            }
10        }
11        return ans;
12    }
13}