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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode currNode = list1;
        int index = 0;
        while(index < a - 1){
            currNode = currNode.next;
            index++;
        }
        ListNode front = currNode;
        while(index < b + 1){
            currNode = currNode.next;
            index ++;
        }
        ListNode rear = currNode;
        ListNode secTail = list2, secHead = list2;
        while(secTail.next != null){
            secTail = secTail.next;
        }
        front.next = secHead;
        secTail.next = rear;
        return list1;
    }
}