import java.util.*;
import java.lang.*;
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
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second  = new ArrayList<>();
        ListNode firstNode = head;
        ListNode secondNode = head;
        while (secondNode != null && secondNode.next != null) {
            first.add(firstNode.val);
            firstNode = firstNode.next;
            secondNode = secondNode.next.next;
        }
        secondNode = firstNode;
        while (secondNode != null) {
            second.add(secondNode.val);
            secondNode = secondNode.next;
        }
        Collections.reverse(second);
        int max = 0;
        for (int i = 0; i < first.size(); i++) {
            int sum = first.get(i) + second.get(i);
            max = Math.max(max, sum);
        }
        return max;
    }
}
