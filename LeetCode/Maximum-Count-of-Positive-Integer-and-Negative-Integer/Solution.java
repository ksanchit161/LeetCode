1class Solution {
2    public int maximumCount(int[] nums) {
3        int l=0;
4        int r=nums.length-1;
5        int neg=0;
6        int pos=0;
7        if(nums[0]>0 || nums[r]<0) return nums.length;
8        while(l<=r){
9            int mid=l+(r-l)/2;
10            if(nums[mid]<0 && nums[mid+1]>=0) {
11                neg=mid+1;
12                break;
13            }
14            else if(nums[mid]>=0) r=mid-1;
15            else{
16                l=mid+1;
17            }
18        }
19        l=0;
20        r=nums.length-1;
21        while(l<=r){
22            int mid=l+(r-l)/2;
23            if(nums[mid]>0 && nums[mid-1]<=0) {
24                pos=nums.length-mid;
25                break;
26            }
27            else if(nums[mid]<=0) l=mid+1;
28            else{
29                r=mid-1;
30            }
31        }
32        return Math.max(pos,neg);
33    
34    }
35}