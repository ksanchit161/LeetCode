1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3       Arrays.sort(nums);
4       int prev=nums[0];
5       for(int i=1;i<nums.length;i++){
6        if(nums[i]==prev) return true;
7        prev=nums[i];
8       }
9        return false;
10    }
11}