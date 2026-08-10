1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int n=mat.length;
4        int m=mat[0].length;
5        if(m*n!=r*c) return mat;
6        int k=0;
7        int result[][]=new int[r][c];
8        for(int i=0;i<r;i++){
9            for(int j=0;j<c;j++){
10                result[i][j] = mat[k/m][k%m];
11                k++;
12            }
13        }
14        return result;
15    }
16}