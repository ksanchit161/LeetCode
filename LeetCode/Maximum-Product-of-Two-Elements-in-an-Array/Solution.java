1class Solution {
2    public int maxProduct(int[] nums) {
3    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
4    for(int ele: nums){
5        pq.add(ele);
6    }
7    int first=pq.poll()-1;
8    int second=pq.poll()-1;
9    return first*second;
10
11    }
12}