/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();//made an empty stack of nodes
        ListNode temp=head;
        while(temp!=null){
            while(st.size()>0 && st.peek().val<temp.val){
                st.pop();//if (peek of current stack) < (new node val) then remove peek & keep removing peek until peek becomes greater than new
            }
            st.push(temp);//else if peek is grreater then push new
            temp=temp.next;
        }
        while(st.size()>0){
            ListNode top=st.pop();//made new node holding top of stack
            top.next=temp;//temp had reached null and top.next=temp
            temp=top;//moving temp backward
        }
        return temp;
    }
}