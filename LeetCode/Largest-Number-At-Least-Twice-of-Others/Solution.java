1class Solution {
2    public int dominantIndex(int[] nums) {
3        int max=-1;
4        int maxid=-1;
5        for(int i=0;i<nums.length;i++){
6            if(max<nums[i]){
7                max=nums[i];
8                maxid=i;
9            }
10        }
11        for(int i=0;i<nums.length;i++){
12            if(max<2*nums[i] && maxid!=i) return -1;
13        }
14        return maxid;
15    }
16}