1class Solution {
2    public List<String> stringSequence(String target) {
3        
4        List<String> res = new ArrayList<>();
5
6        StringBuilder sb = new StringBuilder();
7
8        int idx = 0;
9        for(char ch : target.toCharArray()) {
10
11            sb.append('a');
12            res.add(sb.toString());            
13
14            for(char c = 'b'; c <= ch; c++) {
15                
16                sb.setCharAt(idx, c);
17                res.add(sb.toString());  
18            }
19
20            idx++;
21        }
22
23        return res;
24    }
25}