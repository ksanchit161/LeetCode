1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int[][]result=new int[n][m];
6        for(int j=0;j<n;j++){
7            for(int i=0;i<m;i++){
8                result[j][i]=matrix[i][j];
9            }
10        }
11        return result;
12    }
13}