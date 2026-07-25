1class Solution {
2    public int pivotIndex(int[] nums) {
3        int total=0;
4        for(int ele: nums){
5            total+=ele;
6        }
7        int left=0;
8        for(int i=0;i<nums.length;i++){
9            if(left==(total-nums[i]-left)) return i;
10            left+=nums[i];
11        }
12        return -1;
13    }
14}