1class Solution {
2    public int search(int[] nums, int target) {
3        int start=0;
4        int end=nums.length-1;
5        while(start<=end){
6            int mid=start+(end-start)/2;
7            if(nums[mid]==target) return mid;
8            else if(nums[mid]>target) end=mid-1;
9            else start=mid+1;
10        }
11        return -1;
12    }
13}