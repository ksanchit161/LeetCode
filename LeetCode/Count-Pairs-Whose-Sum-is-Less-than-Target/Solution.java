1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        int count = 0;
4        int n = nums.size();
5        for (int i = 0; i < n; i++) {
6            int m = nums.get(i);
7            for (int j = i + 1; j < n; j++) {
8                if (m + nums.get(j) < target) count++;
9            }
10        }
11        return count;
12    }
13}