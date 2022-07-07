package Easy_Problems;
import java.util.HashSet;

import Easy_Problems.ListNode;
public class remove_duplicates_83 {
    public ListNode deleteDuplicates(ListNode head){
        ListNode a= head;
        while(a!=null && a.next!=null){
            if(a.val==a.next.val){
                a.next = a.next.next;
            }
            else{
                a = a.next;
            }
        }
        return head;
    }
}
