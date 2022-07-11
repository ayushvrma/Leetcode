package Easy_Problems;

/**
 * reverse_LL_206
 * 
 * 
 * 1->2->3->4
 * 4->3->2->1
 * 
 */
public class reverse_LL_206 {

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        } 
        return prev;
    }
}





1->2->3->4->null
2->1
(head){
    Node a = head;
    temp = a.next.next;
    a.next.next = a;
    (temp);
}