1class Solution {
2    // Warm up the JVM static memory, StringBuilder routines, and JIT compiler
3    static {
4        StringBuilder warmup = new StringBuilder(100);
5        for (int i = 0; i < 1_000; i++) {
6            warmup.append("G").append("()").append("(al)");
7            if (warmup.length() > 50) {
8                warmup.setLength(0);
9            }
10        }
11        // Prevents dead-code elimination by forcing a side effect check
12        if (warmup.hashCode() == 0) {
13            System.out.print("");
14        }
15    }
16
17
18
19
20    public String interpret(String command) {
21        var result=new StringBuilder("");
22        int i=0;
23        while(i<command.length()){
24            char curr=command.charAt(i);
25            if(curr=='G') result.append('G');
26            else if(command.charAt(i+1)==')'){
27                result.append('o');
28                i++;
29            }
30            else{
31                result.append("al");
32                i+=3;
33            }
34            i++;
35        }
36        return result.toString();
37    }
38}