// Last updated: 9/8/2026, 12:31:27 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        
14        ListNode dummy = new ListNode(0);
15        dummy.next = head;
16        
17        ListNode prev = dummy;
18        
19        while (head != null) {
20            
21            // Check if current value is duplicated
22            if (head.next != null && head.val == head.next.val) {
23                
24                // Skip all nodes with the duplicate value
25                while (head.next != null && head.val == head.next.val) {
26                    head = head.next;
27                }
28                
29                prev.next = head.next;
30                
31            } else {
32                // Current node is unique
33                prev = prev.next;
34            }
35            
36            head = head.next;
37        }
38        
39        return dummy.next;
40    }
41}