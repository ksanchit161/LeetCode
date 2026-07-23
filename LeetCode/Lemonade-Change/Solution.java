1class Solution {
2    static{
3        int []numbers={5,5,5,5,20,10};
4        for(int i=0;i<=1000;i++){
5            lemonadeChange(numbers);
6        }
7    }
8    public static boolean lemonadeChange(int[] bills) {
9        int arr[]=new int[3];
10        for(int i=0;i<bills.length;i++){
11            if(bills[i]==5) arr[0]+=1;
12            else if(bills[i]==10){
13            arr[1]+=1;
14            arr[0]-=1;
15            if(arr[0]<0) return false;
16            }
17            else{
18                arr[2]+=1;
19                if(arr[1]==0 && arr[0]>=3) arr[0]-=3;
20                else if(arr[1]>0){
21                    arr[1]-=1;
22                    arr[0]-=1;
23                }
24                else{
25                    arr[0]-=1;
26                    arr[1]-=1;
27                }
28            
29                if(arr[0]<0 || arr[1]<0) return false;
30            }
31        }
32        return true;
33    }
34}