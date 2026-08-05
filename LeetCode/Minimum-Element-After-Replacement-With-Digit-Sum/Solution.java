1class Solution {
2    public int sum(int num){
3        int ans=0;
4        while(num>0){
5            int last=num%10;
6            ans+=last;
7            num/=10;
8        }
9        return ans;
10    }
11    public int minElement(int[] nums) {
12        int min=101;
13        for(int i=0;i<nums.length;i++){
14            int number=sum(nums[i]);
15            if(number<min) min=number;
16            if(min==1) return 1;
17        }
18        return min;
19    }
20}