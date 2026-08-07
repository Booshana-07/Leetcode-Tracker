// Last updated: 8/7/2026, 8:31:04 PM
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3
4        if (head == null || head.next == null || k == 0)
5            return head;
6
7        // Find length and last node
8        ListNode tail = head;
9        int length = 1;
10
11        while (tail.next != null) {
12            tail = tail.next;
13            length++;
14        }
15
16        k = k % length;
17
18        if (k == 0)
19            return head;
20
21        // Make circular list
22        tail.next = head;
23
24        // Find new last node
25        int steps = length - k;
26        ListNode newTail = head;
27
28        for (int i = 1; i < steps; i++) {
29            newTail = newTail.next;
30        }
31
32        // New head
33        ListNode newHead = newTail.next;
34
35        // Break the circle
36        newTail.next = null;
37
38        return newHead;
39    }
40}