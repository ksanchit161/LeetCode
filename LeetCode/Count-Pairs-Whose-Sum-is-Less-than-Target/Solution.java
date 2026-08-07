1class Solution {
2    public  int countPairs(List<Integer> nums, int target) {
3        int n = nums.size();
4        int[] arr = new int[n];
5        for (int i = 0; i < n; i++) {
6            arr[i] = nums.get(i);
7        }
8        Arrays.sort(arr);
9        int i=0;
10        int j=n-1;
11        int result=0;
12        while(i<j){
13            int sum=arr[i]+arr[j];
14            if(sum>=target) j--;
15            else{
16                result+=(j-i);
17                i++;
18            }
19        }
20        return result;
21    }
22}