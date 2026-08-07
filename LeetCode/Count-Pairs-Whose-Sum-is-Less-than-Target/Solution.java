1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3      Collections.sort(nums);
4        int i=0;
5        int j=nums.size()-1;
6        int result=0;
7        while(i<j){
8            int sum=nums.get(i)+nums.get(j);
9            if(sum>=target) j--;
10            else{
11                result+=(j-i);
12                i++;
13            }
14        }
15        return result;
16    }
17}