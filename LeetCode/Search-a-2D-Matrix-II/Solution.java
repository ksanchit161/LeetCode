1class Solution {
2    public boolean searchMatrix(int[][] mat, int target) {
3        int i = 0;
4        int j = mat[0].length-1;
5        while(i < mat.length && j >= 0){
6            if (mat[i][j] == target) return true;
7            else if (mat[i][j] > target) j--;
8            else i++;
9        }
10        return false;
11    }
12}