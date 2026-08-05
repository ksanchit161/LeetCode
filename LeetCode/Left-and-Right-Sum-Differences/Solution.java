1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3       int n=nums.length;
4       int []left=new int[n];
5       int []right=new int [n];
6       left[0]=0;
7       for(int i=1;i<n;i++){
8            left[i]=left[i-1]+nums[i-1];
9       } 
10       int curr=0;
11       for(int i=n-1;i>=0;i--){
12        right[i]=curr;
13        curr+=nums[i];
14       }
15       int answer[]=new int[n];
16       for(int i=0;i<n;i++){
17        answer[i]=Math.abs(left[i]-right[i]);
18       }
19       return answer;
20    }
21}