1class Solution {
2    public String intToRoman(int num) {
3        StringBuilder result=new StringBuilder("");
4        while(num>0){
5            if(num>=1000){
6                result.append("M");
7                num-=1000;
8            }
9            else if(num>=900){
10                result.append("CM");
11                num-=900;
12            }
13            else if(num>=500){
14                result.append("D");
15                num-=500;
16            }
17            else if(num>=400){
18                result.append("CD");
19                num-=400;
20            }
21            else if(num>=100){
22                result.append("C");
23                num-=100;
24            }
25            else if(num>=90){
26                result.append("XC");
27                num-=90;
28            }
29            else if(num>=50){
30                result.append("L");
31                num-=50;
32            }
33            else if(num>=40){
34                result.append("XL");
35                num-=40;
36            }
37            else if(num>=10){
38                result.append("X");
39                num-=10;
40            }
41            else if(num>=9){
42                result.append("IX");
43                num-=9;
44            }
45            else if(num>=5){
46                result.append("V");
47                num-=5;
48            }
49            else if(num>=4){
50                result.append("IV");
51                num-=4;
52            }
53            else if(num>=1){
54                result.append("I");
55                num-=1;
56            }
57        }
58        return result.toString();
59    }
60}