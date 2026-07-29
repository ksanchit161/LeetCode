1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int x=0;
4        for(int i=0;i<operations.length;i++){
5            if((operations[i].equals("--X")) || (operations[i].equals("X--"))) x-=1;
6            else x+=1;
7        }
8        return x;
9    }
10}