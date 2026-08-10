1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int n=mat.length;
4        int m=mat[0].length;
5        if(m*n!=r*c) return mat;
6        int temp[]=new int[m*n];
7        int k=0;
8        for(int i=0;i<n;i++){
9            for(int j=0;j<m;j++){
10                temp[k++]=mat[i][j];
11            }
12        }
13        k=0;
14        int result[][]=new int[r][c];
15        for(int i=0;i<r;i++){
16            for(int j=0;j<c;j++){
17                result[i][j]=temp[k++];
18            }
19        }
20        return result;
21    }
22}