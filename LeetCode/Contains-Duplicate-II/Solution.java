1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashSet<Integer>number=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            if(number.contains(nums[i])) return true;
6            number.add(nums[i]);
7            if(number.size()>k) number.remove(nums[i-k]);
8        }
9        return false;
10    }
11}