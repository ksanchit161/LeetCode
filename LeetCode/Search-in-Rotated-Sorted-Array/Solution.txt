1class Solution {
2    public int search(int[] nums, int target) {
3        int start=0;
4        int end=nums.length-1;
5      
6        while(start<=end){
7            int mid=start+(end-start)/2;
8            if(nums[mid]==target) return mid;
9           
10           if(nums[mid]>=nums[start]){
11                if(nums[start]<=target && target<nums[mid]) end=mid-1;
12                else start=mid+1;
13            }
14            
15            else{
16                if(target>nums[mid] && target<=nums[end]) start=mid+1 ;
17                else end=mid-1;
18            }
19            
20        }
21        return -1;
22    }
23}