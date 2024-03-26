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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next != null){
            int gcd = findGcd(temp.val, temp.next.val);
            ListNode i = new ListNode(gcd, temp.next);
            temp.next = i;
            temp = i.next;
        }
        return head;
    }
    public int findGcd(int l, int s){
        if(l % s == 0)  return s;
        return findGcd(s, l%s);
    }
}