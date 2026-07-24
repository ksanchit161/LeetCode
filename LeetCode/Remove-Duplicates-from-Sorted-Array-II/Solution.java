1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n=nums.length;
4        int idx=2;
5        if(nums.length<=2) return n;
6        for(int i=2;i<n;i++){
7            if(nums[i]!=nums[idx-2]) {
8                nums[idx]=nums[i];
9                idx++;
10            }
11
12        }
13        return idx;
14      
15    }
16}