1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int ans=-1;
4        int min=Integer.MAX_VALUE;
5        for(int i=0;i<drones.length;i++){
6            int distance=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
7            if(distance<=drones[i][2]){
8                if(distance<min){
9                    min=distance;
10                    ans=i;
11                }
12                
13            }
14        }
15        return ans;
16    }
17}