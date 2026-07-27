1class Solution {
2    static{
3       int [] number={1,2,3,4,5};
4        for(int i=0;i<1000;i++){
5            findMissingElements(number);
6        }
7    }
8    public static  List<Integer> findMissingElements(int[] nums) {
9        int min=101;
10        int max=-1;
11        for(int i=0;i<nums.length;i++){
12            min=Math.min(min,nums[i]);
13            max=Math.max(max,nums[i]);
14        }
15        int arr[]=new int[max-min+1];
16        for(int ele:nums){
17            arr[ele-min]+=1;
18        }
19        List<Integer> result=new ArrayList<>();
20        for(int i=0;i<=max-min;i++){
21            if(arr[i]==0) result.add(i+min);
22        }
23        return result;
24    }
25}