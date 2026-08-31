1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        int arr[]=new int[1001];
4        for(int num: nums1){
5            arr[num]+=1;
6        }
7        int k=0;
8        int ans[]=new int[1001];
9        for(int num: nums2){
10            if(arr[num]>=1) {
11                ans[k++]=num;
12                arr[num]-=1;
13            }
14        }
15        return Arrays.copyOf(ans,k);
16    }
17}