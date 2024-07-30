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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ListNode zero = new ListNode();
        ListNode res = zero;
        int z = 0;
        int sum = 0;
        while(temp != null) {
            if(temp.val == 0) {
                z++;
            } else {
                sum += temp.val;
            }
            if(z == 2) {
                res.next = new ListNode(sum);
                res = res.next;
                sum = 0;
                z = 1;
            }
            temp = temp.next;
        }
        return zero.next;
    }
}
