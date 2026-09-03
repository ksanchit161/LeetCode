1class Solution {
2    public int majorityElement(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int prev= nums[0];
6        int count=1;
7        for(int i=1;i<=n;i++){
8            if(count>(n/2)) return prev;
9            if(nums[i]==prev) count++;
10            else {
11                count=1;
12                prev=nums[i];
13            }
14        }
15        return prev;
16    }
17}