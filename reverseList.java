/*
Reverse a singly linked list.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//iteratively 
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while(head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

//recursively
public class Solution {
    ListNode pre = null;
    public ListNode reverseList(ListNode head) {
        if(head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            reverseList(next);
        }
        return pre;
    }
}