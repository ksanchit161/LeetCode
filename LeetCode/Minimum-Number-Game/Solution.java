1class Solution {
2    public int[] numberGame(int[] nums) {
3        int arr[]=new int[101];
4        for(int ele:nums){
5            arr[ele]+=1;
6        }
7        int n=nums.length;
8        int result[]=new int[n];
9        int i=0;
10        for(int k=1;k<101;k++){
11            while(arr[k]>=1){
12                result[i++]=k;
13                arr[k]-=1;
14            }
15        }
16        int m=0,p=1;
17        while(m<n && p<n){
18            int temp=result[m];
19            result[m]=result[p];
20            result[p]=temp;
21            m+=2;
22            p+=2;
23        }
24        return result;
25    }
26}