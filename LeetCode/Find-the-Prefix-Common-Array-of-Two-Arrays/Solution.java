1class Solution {
2    public int compare(int[]A,int []B){
3        int count=0;
4        for(int i=1;i<51;i++){
5            if(A[i]==B[i] && A[i]>0) count++;
6        }
7        return count;
8    }
9    public int[] findThePrefixCommonArray(int[] A, int[] B) {
10        int result[]=new int [A.length];
11        int count1[]=new int [51];
12        int count2[]=new int [51];
13        for(int i=0;i<A.length;i++){
14            count1[A[i]]++;
15            count2[B[i]]++;
16            result[i]=compare(count1,count2);
17        }
18        return result;
19    }
20}