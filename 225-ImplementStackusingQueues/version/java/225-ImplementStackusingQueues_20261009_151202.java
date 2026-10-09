// Last updated: 10/9/2026, 3:12:02 PM
1
2import java.util.LinkedList;
3import java.util.Queue;
4
5class MyStack {
6    Queue<Integer> q1 = new LinkedList<>();
7    Queue<Integer> q2 = new LinkedList<>();
8
9    public MyStack() {
10    }
11
12    public void push(int x) {
13        q2.offer(x);
14
15        while (!q1.isEmpty()) {
16            q2.offer(q1.poll());
17        }
18
19        Queue<Integer> temp = q1;
20        q1 = q2;
21        q2 = temp;
22    }
23
24    public int pop() {
25        return q1.poll();
26    }
27
28    public int top() {
29        return q1.peek();
30    }
31
32    public boolean empty() {
33        return q1.isEmpty();
34    }
35}
36