// Last updated: 8/31/2026, 4:15:12 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12
13    public ListNode partition(ListNode head, int x) {
14
15        // Dummy node for values less than x
16        ListNode smaller = new ListNode(0);
17        ListNode small = smaller;
18
19        // Dummy node for values greater than or equal to x
20        ListNode greater = new ListNode(0);
21        ListNode large = greater;
22
23        ListNode current = head;
24
25        while (current != null) {
26
27            if (current.val < x) {
28                small.next = current;
29                small = small.next;
30            } else {
31                large.next = current;
32                large = large.next;
33            }
34
35            current = current.next;
36        }
37
38        // End the greater list
39        large.next = null;
40
41        // Connect smaller list with greater list
42        small.next = greater.next;
43
44        return smaller.next;
45    }
46}