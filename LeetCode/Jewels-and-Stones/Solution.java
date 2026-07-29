1class Solution {
2    static {
3        for(int i=1;i<100;i++){
4            numJewelsInStones("aAZ","aaZzb");
5        }
6    }
7    public static int numJewelsInStones(String jewels, String stones) {
8        int ans=0;
9        for(int i=0;i<jewels.length();i++){
10            char ch=jewels.charAt(i);
11            for(int j=0;j<stones.length();j++){
12                char ch2=stones.charAt(j);
13                if(ch==ch2) ans++;
14            }
15        }
16        return ans;
17    }
18}