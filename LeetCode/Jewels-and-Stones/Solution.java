1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int ans=0;
4        HashMap<Character,Integer>arr=new HashMap<>();
5        for(int i=0;i<stones.length();i++){
6           char ch=stones.charAt(i);
7            arr.put(ch,arr.getOrDefault(ch,0)+1);
8        }
9        for(int i=0;i<jewels.length();i++){
10            ans+=arr.getOrDefault(jewels.charAt(i),0);
11        }
12        return ans;
13    }
14}