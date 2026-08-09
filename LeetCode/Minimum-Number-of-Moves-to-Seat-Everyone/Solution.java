1class Solution {
2    public int minMovesToSeat(int[] seats, int[] students) {
3        int sum=0;
4       int seen[]=new int[101];
5       int seen2[]=new int[101];
6        for(int i=0;i<seats.length;i++){
7            seen[seats[i]]+=1;
8        }
9        for(int i=0;i<students.length;i++){
10            seen2[students[i]]+=1;
11        }
12        int i=1,j=1;
13       while(i<101 && j<101){
14        while(i<101 && seen[i]==0){
15          i++;
16        }
17        while(j<101 && seen2[j]==0){
18            j++;
19        }
20        if(i<101 && j<101){
21            sum+=Math.abs(j-i);
22            seen[i]--;
23            seen2[j]--;
24        }
25        }
26    
27        return sum;
28    }
29}