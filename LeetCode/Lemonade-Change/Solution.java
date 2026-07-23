1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int arr[]=new int[3];
4        for(int i=0;i<bills.length;i++){
5            if(bills[i]==5) arr[0]+=1;
6            else if(bills[i]==10){
7            arr[1]+=1;
8            arr[0]-=1;
9            if(arr[0]<0) return false;
10            }
11            else{
12                arr[2]+=1;
13                if(arr[1]==0 && arr[0]>=3) arr[0]-=3;
14                else if(arr[1]>0){
15                    arr[1]-=1;
16                    arr[0]-=1;
17                }
18                else{
19                    arr[0]-=1;
20                    arr[1]-=1;
21                }
22            
23                if(arr[0]<0 || arr[1]<0) return false;
24            }
25        }
26        return true;
27    }
28}