1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=0;
4        int smax=-1;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>max){
7                smax=max;
8                max=nums[i];
9            }
10            else if(nums[i]>smax){
11                smax=nums[i];
12            }
13        }
14        return (max-1)*(smax-1);
15    }
16}