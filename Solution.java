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
    public ListNode sortList(ListNode head) {
        if(head == null){
            return(head);
        }

        ListNode current = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        list.sort(null);

        current = head;
        for(int i = 0; i < list.size(); i++){
            current.val = list.get(i);
            current = current.next;
        }
        return(head);
    }
}
