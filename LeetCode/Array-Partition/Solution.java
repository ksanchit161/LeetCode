1class Solution {
2    public int arrayPairSum(int[] nums) {
3        int len=nums.length;
4        int arr[]=new int[20001];
5        int max=-1;
6        for(int ele:nums){
7            arr[ele+10000]+=1;
8            ele+=10000;
9            if(ele>max) max=ele;
10        }
11        int sum=0;
12        int count=0;
13        int i=0;
14       while(i<=max){
15            while(arr[i]>=2 && count==0){
16                sum+=i;
17                arr[i]-=2;
18            }
19            if(arr[i]>=1 && count==0){
20                sum+=i;
21                arr[i]-=1;
22                count+=1;
23            }
24            else if(arr[i]>=1 && count==1){
25                arr[i]-=1;
26                count=0;
27            }
28            else if(arr[i]==0) i++;
29        }
30        return sum-(len/2)*10000;
31    }
32}