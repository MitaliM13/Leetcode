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
    public ListNode doubleIt(ListNode head) {
        ListNode l1=reverseList(head);
         ListNode dummy = new ListNode(0); // creating an dummy list
        ListNode curr = dummy;
        int c=0;
        while(l1!=null || c==1){
            int s=0;
            if(l1!=null){        
                s+=l1.val;
                l1=l1.next;
            }
          
            s*=2;
            s+=c;
            c=s/10;
            int res=s%10;
            ListNode node = new ListNode(res); 
            dummy.next = node; 
            dummy = dummy.next;
     }
    return reverseList(curr.next);
}
     public ListNode reverseList(ListNode head) {
        ListNode nw = head;
        ListNode temp=null;  // if we initialize it then it val will be 0 , which will be add in the LL and creates an extra size;
    // * so we declare LL as null, so no value is assigned to LL;
        while(nw!=null){
            ListNode n=nw.next;
            nw.next=temp;
            temp=nw;
            nw=n;

        }
        return temp;

    }
}



// import java.util.Stack;

// class Solution {
//     public ListNode doubleIt(ListNode head) {
//         long num = 0;
//         while (head != null) {
//             num = num * 10 + head.val;
//             head = head.next;
//         }
        
//         long curr = num * 2;
        
//         Stack<Integer> stack = new Stack<>();
        
//         if (curr == 0) {
//             return new ListNode(0);
//         }
        
//         // Extract digits from the doubled number and push them onto the stack
//         while (curr != 0) {
//             int digit = (int) (curr % 10); // Extract the last digit accurately
//             stack.push(digit);
//             curr /= 10;
//         }
        
//         ListNode dummy = new ListNode(-1);
//         ListNode current = dummy;
        
//         // Pop digits from the stack to construct the result list in reverse order
//         while (!stack.isEmpty()) {
//             int digit = stack.pop();
//             ListNode newNode = new ListNode(digit);
//             current.next = newNode;
//             current = current.next;
//         }
        
//         return dummy.next;
//     }
// }

