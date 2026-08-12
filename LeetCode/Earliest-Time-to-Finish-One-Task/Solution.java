1class Solution {
2    public int earliestTime(int[][] tasks) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<tasks.length;i++){
5            int start=tasks[i][0];
6            int end=tasks[i][1];
7            int sum=start+end;
8            if(sum<min) min=sum;
9        }
10        return min;
11    }
12}