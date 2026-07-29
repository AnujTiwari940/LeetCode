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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)return null;
/* 
    lists==null means no any array of lists given
    lists.length==0 means list is given but empty(no element)
*/      ListNode ans=lists[0];
        //heads of k lists given in array so stored 1st head (lists[0]) in ans
        for(int i=1;i<lists.length;i++){//can run this loop in array
            ans = mergeTwoList(ans,lists[i]);
/*
    iteratively merging lists in pairs
    1st step -> ans =mergeTwoList(lists[0],lists[1]); 
    in 2nd step ans will hold merged of 1st step and list[i]->lists[2]
    and so on until loop breaks
*/      }
        return ans;
    }

    public ListNode mergeTwoList(ListNode list1,ListNode list2){
        ListNode i=list1;
        ListNode j=list2;
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next=i;
                k=k.next;
                i=i.next;
            }
            else{
                k.next=j;
                k=k.next;
                j=j.next;
            }
        }
        if(i==null)k.next=j;
        else k.next=i;
        return dummy.next;
    }
}