1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int zero=0;
4        int id=-1;
5        int prod=1;
6        int res[]=new int[nums.length];
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]==0){
9                zero++;
10                id=i;
11            }
12            else prod*=nums[i];
13        }
14        if(zero>=2){
15            return res;
16        }
17        else if(zero>=1){
18            res[id]=prod;
19            return res;
20        }
21        else if(zero==0){
22            for(int i=0;i<nums.length;i++){
23                res[i]=prod/nums[i];
24            }
25        }
26        return res;
27    }
28}