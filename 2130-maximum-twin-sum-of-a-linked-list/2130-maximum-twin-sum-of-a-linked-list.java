class Solution {
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        // Find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Second half
        ListNode head2 = slow.next;
        slow.next = null;
        // Reverse second half
        head2 = reverse(head2);

        // Compare twin nodes
        ListNode i = head;
        ListNode j = head2;
        int max = 0;
        while (j != null) {
            int sum = i.val + j.val;
            max = Math.max(max, sum);
            i = i.next;
            j = j.next;
        }
       return max;
    }
}