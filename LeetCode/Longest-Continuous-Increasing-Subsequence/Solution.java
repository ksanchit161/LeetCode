1class Solution {
2    public int findLengthOfLCIS(int[] nums) {
3        int max=1;
4        int length=1;
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]<nums[i+1]) length+=1;
7            if(length>max) max=length;
8            if(nums[i]>=nums[i+1]) length=1;
9        }
10        return max;
11    }
12}