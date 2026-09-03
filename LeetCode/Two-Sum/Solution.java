1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer>map=new HashMap<>();
4        int []result=new int[2];
5        for(int i=0;i<nums.length;i++){
6            int compliment=target-nums[i];
7            if(map.containsKey(compliment)){
8                result[0]=map.get(compliment);
9                result[1]=i;
10                return result;
11            }
12            map.put(nums[i],i);
13            
14        }
15        return result;
16    }
17}