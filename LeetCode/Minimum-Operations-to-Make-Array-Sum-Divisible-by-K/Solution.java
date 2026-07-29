1class Solution {
2    static{
3        int []number={1,2,3,4};
4        for(int i=0;i<1000;i++){
5             minOperations(number,4);
6        }
7    }
8    public static int minOperations(int[] nums, int k) {
9        int sum=0;
10        for(int ele:nums){
11            sum+=ele;
12        }
13        return sum%k;
14    }
15}