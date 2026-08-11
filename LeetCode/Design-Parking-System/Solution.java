1class ParkingSystem {
2    int big=0;
3    int med=0;
4    int small=0;
5    public ParkingSystem(int big, int medium, int small) {
6        this.big=big;
7        this.med=medium;
8        this.small=small;
9    }
10    
11    public boolean addCar(int carType) {
12        if(carType==1){
13            if(big>=1) {
14                big-=1;
15                return true;
16            }
17            else return false;
18        }
19        else if(carType==2){
20            if(med>=1){
21                med-=1;
22                return true;
23            }
24            else return false;
25        }
26        else {
27            if(small>=1){
28                small-=1;
29                return true;
30            }
31            else return false;
32        }
33    }
34}
35
36/**
37 * Your ParkingSystem object will be instantiated and called as such:
38 * ParkingSystem obj = new ParkingSystem(big, medium, small);
39 * boolean param_1 = obj.addCar(carType);
40 */