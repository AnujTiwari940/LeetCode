/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public boolean isPalindrome(ListNode head) {
        // 0 or 1 node
        if (head == null || head.next == null)return true;

        // Find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;//head2 is head of 2nd half
        slow.next = null;//last node of 1st half connected to null

        // Reverse second half
        ListNode curr = head2;
        ListNode prev = null;
        ListNode fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        // Compare both halves
        ListNode i = head;
        ListNode j = prev;//Important: as second half is reversed so prev is our head of second half not head2
        while (j != null) {
            if (i.val != j.val) {
                return false;
            }
            i = i.next;
            j = j.next;
        }
        return true;
    }
}