1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int left=1;
4        int right=1;
5        int res[]=new int[nums.length];
6        for(int i=0;i<nums.length;i++){
7            res[i]=left;
8            left*=nums[i];
9        }
10        for(int i=nums.length-1;i>=0;i--){
11            res[i]*=right;
12            right*=nums[i];
13        }
14        return res;
15    }
16
17}