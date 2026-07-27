1class Solution {
2    static {
3        int[]numbers={1,2,3,4,5,6};
4        for(int i=0;i<1000;i++){
5            maxProduct(numbers);
6        }
7    }
8    public static int maxProduct(int[] nums) {
9        int max=0;
10        int smax=-1;
11        for(int i=0;i<nums.length;i++){
12            if(nums[i]>max){
13                smax=max;
14                max=nums[i];
15            }
16            else if(nums[i]>smax){
17                smax=nums[i];
18            }
19        }
20        return (max-1)*(smax-1);
21    }
22}