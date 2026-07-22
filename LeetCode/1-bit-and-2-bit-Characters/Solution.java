1class Solution {
2    public boolean isOneBitCharacter(int[] bits) {
3        int i = 0;
4        
5       
6        while (i < bits.length - 1) {
7            if (bits[i] == 1) {
8                i += 2; 
9            } else { // if we spot 0 move foward by 1
10                i += 1; 
11            }
12        }
13        return i == bits.length - 1;
14    }
15}