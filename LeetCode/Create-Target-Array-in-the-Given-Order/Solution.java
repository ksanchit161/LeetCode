1class Solution {
2    public int[] createTargetArray(int[] nums, int[] index) {
3        int n = nums.length;
4        int[] result = new int[n];
5
6        for (int i=0;i<n;i++) {
7            for (int j=i;j>index[i];j--) {
8                result[j] = result[j - 1];
9            }
10            result[index[i]] = nums[i];
11        }
12        return result;
13    }
14}