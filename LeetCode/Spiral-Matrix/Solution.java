1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int count=0;
4        int m=matrix.length;
5        int n=matrix[0].length;
6        int r1=0;
7        int r2=m-1;
8        int c1=0;
9        int c2=n-1;
10        var result= new ArrayList<Integer>();
11        int k=0;
12        while(count<(m*n)){
13           for(int i=c1;i<=c2 && count<(m*n);i++){
14            result.add(matrix[r1][i]);
15            count++;
16           }
17           r1++;
18           for(int i=r1;i<=r2 && count<(m*n);i++){
19            result.add(matrix[i][c2]);
20             count++;
21           }
22           c2--;
23           for(int i=c2;i>=c1 && count<(m*n);i--){
24            result.add(matrix[r2][i]);
25             count++;
26           }
27           r2--;
28           for(int i=r2;i>=r1 && count<(m*n);i--){
29            result.add(matrix[i][c1]);
30             count++;
31           }
32           c1++;
33        }
34        return result;
35    }
36}