1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        List<Boolean> result=new ArrayList<>();
4        int max=-1;
5        for(int i=0;i<candies.length;i++){
6            max=Math.max(max,candies[i]);
7        }
8        for(int i=0;i<candies.length;i++){
9          if((candies[i]+extraCandies)>=max) result.add(true);
10          else result.add(false);      
11         }
12        return result;
13
14    }
15}