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
    public int pairSum(ListNode head) {
        int ans=0;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;
        ListNode cur=slow;

        while(cur!=null){
            ListNode nxt= cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }

        ListNode first=head;
        ListNode sec=prev;
        while(sec!=null){
            ans=Math.max(ans, first.val+sec.val);
            first=first.next;
            sec=sec.next;
        }
    return ans;
    }
}