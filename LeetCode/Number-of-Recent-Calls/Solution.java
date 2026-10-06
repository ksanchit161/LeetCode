1class RecentCounter {
2    Queue<Integer> q=new LinkedList<>();
3    int count;
4    public RecentCounter() {
5        count=0;
6    }
7    
8    public int ping(int t) {
9        q.add(t);
10        while(q.peek()<(t-3000) || q.peek()>t){
11            q.poll();
12        }
13        return q.size();
14
15    }
16}
17
18/**
19 * Your RecentCounter object will be instantiated and called as such:
20 * RecentCounter obj = new RecentCounter();
21 * int param_1 = obj.ping(t);
22 */