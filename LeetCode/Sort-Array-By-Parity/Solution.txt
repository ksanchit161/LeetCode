1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int start=0;
4        int end=nums.length-1;
5        while(start<end){
6            if(nums[start]%2!=0 && nums[end]%2==0){
7                int temp=nums[start];
8                nums[start]=nums[end];
9                nums[end]=temp;
10                start++;
11                end--;
12            }
13            else if(nums[start]%2==0) start++;
14            else if(nums[end]%2!=0) end--;
15        }
16        return nums;
17    }
18}