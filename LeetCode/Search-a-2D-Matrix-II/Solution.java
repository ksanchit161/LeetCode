1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int rows=matrix.length;
4        int cols=matrix[0].length;
5        int r=0;
6        int c=cols-1;
7        while(r<rows && c>=0){
8            int ele=matrix[r][c];
9            if(ele==target) return true;
10            else if(ele>target) c--;
11            else r++;
12        }
13        return false;
14    }
15}