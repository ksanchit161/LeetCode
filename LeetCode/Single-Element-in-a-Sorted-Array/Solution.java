1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int left=0;
4        int right=nums.length-1;
5        int n=nums.length;
6        if(n==1) return nums[0];
7        if(nums[0]!=nums[1]) return nums[0];
8        if(nums[n-1]!=nums[n-2]) return nums[n-1];
9        while(left<=right){
10            int mid=left+(right-left)/2;
11            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
12            else if(nums[mid]!=nums[mid+1]){
13                if(mid%2==0) right=mid-1;
14                else left=mid+1;
15            }
16            else if(nums[mid]!=nums[mid-1]){
17                if(mid%2==0) left=mid+1;
18                else right=mid-1;
19            }
20        }
21        return -1;
22    }
23}