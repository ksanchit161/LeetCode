1class Solution {
2    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
3        int sum=0;
4        for(int i=0;i<nums.size();i++){
5            int element=i;
6            int count=0;
7            while(element>0){
8                if((element&1)==1) count++;
9                element=element>>1;
10            }
11            if(count==k){
12                sum+=nums.get(i);
13            }
14        }
15        return sum;
16    }
17}