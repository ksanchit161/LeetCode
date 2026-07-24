1class Solution {
2    public boolean search(int[] nums, int target) {
3        int start=0;
4        int end=nums.length-1;
5        while(start<=end){
6            int mid=start+(end-start)/2;
7            if(nums[mid]==target) return true;
8            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
9                start++;
10                end--;
11                continue;
12            }
13            if(nums[start]<=nums[mid]){
14                if(target>=nums[start] && target<nums[mid]) end=mid-1;
15            else start=mid+1;
16            }
17            else{
18            if(target<=nums[end] && target>nums[mid]) start=mid+1;
19            else end=mid-1;
20            }
21            
22        }
23        return false;
24    }
25}