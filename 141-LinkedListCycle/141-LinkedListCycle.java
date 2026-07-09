// Last updated: 7/9/2026, 3:10:42 PM
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          
            fast = fast.next.next;    

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}