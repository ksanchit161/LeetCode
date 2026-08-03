1class Solution {
2    static {
3        int[][] mat = {
4            {1, 4, 15}, 
5            {2, 5, 19}, 
6            {3, 6, 25}
7        };
8        Solution obj = new Solution();
9        for (int i = 0; i <= 1000; i++) {
10            obj.searchMatrix(mat, 15);
11        }
12    }
13  
14    public static boolean searchMatrix(int[][] matrix, int target) {
15        int rows=matrix.length;
16        int cols=matrix[0].length;
17        int r=0;
18        int c=cols-1;
19        while(r<rows && c>=0){
20            int ele=matrix[r][c];
21            if(ele==target) return true;
22            else if(ele>target) c--;
23            else r++;
24        }
25        return false;
26    }
27}