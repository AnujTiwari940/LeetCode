class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode i = l1;
        ListNode j = l2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while (i!=null || j!=null || carry!=0) {
            int sum = carry;
            if (i != null) {
                sum += i.val;
                i = i.next;
            }
            if (j != null) {
                sum += j.val;
                j = j.next;
            }
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        return reverseList(dummy.next);
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null; 
        ListNode fwd = null; 
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev; 
            prev = curr; 
            curr = fwd; 
            }
        return prev;
    }
}