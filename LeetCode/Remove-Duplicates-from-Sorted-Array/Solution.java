1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int size=nums.length;
4        int prev=0;
5        for(int i=1;i<size;i++){
6            if(nums[prev]==nums[i]){
7                continue;
8            }
9            else{
10                nums[prev+1]=nums[i];
11                prev+=1;
12            }
13        }
14        return prev+1;
15
16    }
17}