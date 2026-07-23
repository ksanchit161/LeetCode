1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int start=0;
4        int end=numbers.length-1;
5        int result[]=new int[2];
6        while(start<end){
7            int sum=numbers[start]+numbers[end];
8            if(sum==target){
9                result[0]=start+1;
10                result[1]=end+1;
11                return result;
12            }
13            else if(sum>target) end--;
14            else start++;
15        }
16        return result;
17    }
18}