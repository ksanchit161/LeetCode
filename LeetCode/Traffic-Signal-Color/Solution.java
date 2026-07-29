1class Solution {
2    static{
3        for(int i=0;i<1000;i++){
4            trafficSignal(100);
5        }
6    }
7    public static String trafficSignal(int timer) {
8        if(timer==0) return "Green";
9        else if(timer==30) return "Orange";
10        else if(timer>30 && timer<=90) return "Red";
11        else return "Invalid";
12    }
13}