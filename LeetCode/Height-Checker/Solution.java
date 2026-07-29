1class Solution {
2    public int heightChecker(int[] heights) {
3        int []arr=new int[101];
4        int []expected=new int[heights.length];
5        int k=0;
6        for(int ele:heights){
7            arr[ele]+=1;
8        }
9        for(int i=1;i<101;i++){
10            while(arr[i]>=1){
11                expected[k++]=i;
12                arr[i]-=1;
13            }
14        }
15        int count=0;
16        for(int i=0;i<heights.length;i++){
17            if(heights[i]!=expected[i]) count+=1;
18        }
19        return count;
20    }
21}