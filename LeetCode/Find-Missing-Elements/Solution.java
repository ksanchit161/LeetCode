1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int min=101;
4        int max=-1;
5        for(int i=0;i<nums.length;i++){
6            min=Math.min(min,nums[i]);
7            max=Math.max(max,nums[i]);
8        }
9        int arr[]=new int[max-min+1];
10        for(int ele:nums){
11            arr[ele-min]+=1;
12        }
13        List<Integer> result=new ArrayList<>();
14        for(int i=0;i<=max-min;i++){
15            if(arr[i]==0) result.add(i+min);
16        }
17        return result;
18    }
19}