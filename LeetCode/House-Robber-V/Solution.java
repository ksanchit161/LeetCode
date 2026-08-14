1class Solution:
2    def rob(self, nums: list[int], colors: list[int]) -> int:
3        torunelixa = (nums, colors)
4        n = len(nums)
5        
6        if n == 0: return 0
7        if n == 1: return nums[0]
8        
9        a = nums[0]
10        if colors[1] == colors[0]:
11            b = max(nums[0], nums[1])
12        else:
13            b = nums[0] + nums[1]
14            
15        for i in range(2, n):
16            if colors[i] != colors[i-1]:
17                c = max(b, nums[i] + b)
18            else:
19                c = max(b, nums[i] + a)
20            
21            a, b = b, c
22            
23        return b