1class Solution {
2    public int findShortestSubArray(int[] nums) {
3        int []arr=new int[50000];
4        int degree=0;
5        HashMap<Integer,List<Integer>> temp=new HashMap<>();
6        for(int i=0;i<nums.length;i++){
7            arr[nums[i]]+=1;
8            temp.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);;
9            if(arr[nums[i]]>degree) {
10                degree=arr[nums[i]];
11            }
12        }
13        int min=Integer.MAX_VALUE;
14        for(List<Integer> indexes: temp.values()){
15            if(indexes.size()==degree){
16                int start=indexes.get(0);
17                int end=indexes.get(indexes.size()-1);
18                if((end-start)<min) min=end-start;
19            }
20        }
21        return min+1;
22    }
23}