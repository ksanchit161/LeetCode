1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        int inc=0;
4        int dec=0;
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]<nums[i+1]) inc++;
7            else if(nums[i]>nums[i+1]) dec++;
8            if(inc>0 && dec>0) return false;
9        }
10        return true;
11    }
12}