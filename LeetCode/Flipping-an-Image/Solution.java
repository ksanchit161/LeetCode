1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        int n=image.length;
4        int [][]result=new int[n][n];
5        for(int i=0;i<n;i++){
6            int k=0;
7            for(int j=n-1;j>=0;j--){
8                int ele=image[i][j];
9                if(ele==0) result[i][k++]=1;
10                else result[i][k++]=0;
11            }
12        }
13        return result;
14    }
15}