1class Solution {
2    public void setZeroes(int[][] matrix) {
3    HashSet<Integer>rows=new HashSet<>();
4    HashSet<Integer>cols=new HashSet<>();
5    int n=matrix.length;
6    int m=matrix[0].length;
7    for(int i=0;i<n;i++){
8        for(int j=0;j<m;j++){
9            if(matrix[i][j]==0){
10                rows.add(i);
11                cols.add(j);
12                
13            }
14        }
15    }
16    for(int ele:rows){
17        for(int j=0;j<m;j++){
18            matrix[ele][j]=0;
19        }
20    }
21    for(int ele:cols){
22        for(int i=0;i<n;i++){
23            matrix[i][ele]=0;
24        }
25    }
26
27    }
28}