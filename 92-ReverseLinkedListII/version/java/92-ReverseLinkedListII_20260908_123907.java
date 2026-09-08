// Last updated: 9/8/2026, 12:39:07 PM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13
14        ListNode dummy = new ListNode(0);
15        dummy.next = head;
16
17        ListNode prev = dummy;
18
19        // Move prev to the node before 'left'
20        for (int i = 1; i < left; i++) {
21            prev = prev.next;
22        }
23
24        ListNode current = prev.next;
25
26        // Reverse nodes from left to right
27        for (int i = 0; i < right - left; i++) {
28            ListNode nextNode = current.next;
29
30            current.next = nextNode.next;
31            nextNode.next = prev.next;
32            prev.next = nextNode;
33        }
34
35        return dummy.next;
36    }
37}