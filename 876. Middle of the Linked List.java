//Solution 1
//Time Complexity = n
//Space Complexity = n
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
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array = new ArrayList<> ();
        
        int length = 0;
        while(head != null) {
            array.add(head);
            head = head.next;
            length++;
        }
        
        return array.get(length / 2);
    }
}

//Solution 2
//Time Complexity = n
//Space Complexity = 1
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
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        
        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        
        return middle;
    }
}
