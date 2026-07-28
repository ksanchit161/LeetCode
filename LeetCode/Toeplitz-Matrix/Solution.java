1class Solution {
2    public boolean isToeplitzMatrix(int[][] matrix) {
3        int rows=matrix.length;
4        int column=matrix[0].length;
5        for(int i=1;i<rows;i++){
6            for(int j=1;j<column;j++){
7            int curr=matrix[i][j];
8            int ele=matrix[i-1][j-1];
9            if(curr!=ele) return false;
10            }
11        }
12        return true;
13    }
14}