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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next ==null || k==0) return head;
        ListNode temp = head , prev = null;
        int size =0;
        while(temp !=null){
            size++;
            prev = temp ;
            temp = temp.next;
        }
        
        if(k%size == 0) return head;
        int rotation = size - (k%size);
        prev.next = head;

        int i=0;
        temp = head;
        while(i<rotation-1){
            temp = temp.next;
            i++;
        }
        head = temp.next;
        temp.next = null;
        
        return head;
    }
}