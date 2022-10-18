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
       
      ArrayList<ListNode> myList = new ArrayList<>();
        
        while(head != null){
            
            myList.add(head);
            head = head.next;            
        }
        
    
        return myList.get((myList.size()/2));
    }
}