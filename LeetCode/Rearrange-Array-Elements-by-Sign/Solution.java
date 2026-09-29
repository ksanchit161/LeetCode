1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int[] ans = new int[nums.length];
4        int posIndex = 0; 
5        int negIndex = 1; 
6        
7        for (int i = 0; i < nums.length; i++) {
8            if (nums[i] > 0) {
9                ans[posIndex] = nums[i];
10                posIndex += 2;
11            } else {
12                ans[negIndex] = nums[i];
13                negIndex += 2;
14            }
15        }
16        
17        return ans;
18    }
19}