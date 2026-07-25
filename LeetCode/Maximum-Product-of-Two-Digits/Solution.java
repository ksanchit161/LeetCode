1class Solution {
2    public int maxProduct(int n) {
3        int arr[]=new int[10];
4        while(n>0){
5            int last=n%10;
6            arr[last]+=1;
7            n/=10;
8        }
9        int product=1;
10      int count=0;
11        for(int i=9;i>=0;i--){
12            if(arr[i]>=2 && count==0) {
13                product=i*i;
14                break;
15            }
16            else if(arr[i]>=1 && count==1) {
17                product*=i;
18                break;
19            }
20            else if(arr[i]>=1) {
21                product*=i;
22                count++;
23            }
24        }
25        return product;
26    }
27}