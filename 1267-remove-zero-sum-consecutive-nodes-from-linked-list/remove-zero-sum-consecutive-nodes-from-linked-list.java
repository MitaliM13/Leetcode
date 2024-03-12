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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dum = new ListNode(0);
        dum.next = head;

        int preSum = 0;

        Map<Integer, ListNode> PrefixSumToNode = new HashMap<>();

        for(ListNode current = dum; current != null; current = current.next){
            preSum += current.val;

            if(PrefixSumToNode.containsKey(preSum)){
                ListNode prev = PrefixSumToNode.get(preSum);
                ListNode toRemove = prev.next;
                int p = preSum + (toRemove != null ? toRemove.val : 0);

                while(p != preSum){
                    PrefixSumToNode.remove(p);
                    toRemove = toRemove.next;
                    p += (toRemove != null ? toRemove.val : 0);
                }

                prev.next = current.next;
            } else {
                PrefixSumToNode.put(preSum, current);
            }
        }
        return dum.next;
    }
}