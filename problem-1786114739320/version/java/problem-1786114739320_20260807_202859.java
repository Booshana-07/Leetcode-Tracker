// Last updated: 8/7/2026, 8:28:59 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode current = head;
4
5        while (current != null && current.next != null) {
6            if (current.val == current.next.val) {
7                current.next = current.next.next; // Remove duplicate
8            } else {
9                current = current.next; // Move to next node
10            }
11        }
12
13        return head;
14    }
15}