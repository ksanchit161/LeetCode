1class Solution {
2    public int calPoints(String[] operations) {
3        int n=operations.length;
4        int []record=new int[n];
5        int k=0;
6        for(int i=0;i<n;i++){
7            String ch=operations[i];
8            if(ch.equals("+")){
9                record[k]=record[k-1]+record[k-2];
10                k++;
11            }
12            else if(ch.equals("C")) k--;
13            else if(ch.equals("D")){
14                 record[k]=2*record[k-1];
15                 k++;
16            }
17            else record[k++]=Integer.valueOf(ch);
18        }
19        int sum=0;
20        for(int i=0;i<k;i++){
21            sum+=record[i];
22        }
23        return sum;
24    }
25}