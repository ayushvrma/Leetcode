package Easy_Problems;

public class pallindrom_LL_234 {
    public boolean isPalindrome(ListNode head){
        ListNode a = head;
        ListNode b = head;
        while(b!=null && b.next!=null){
            a = a.next;
            b = b.next.next;
        }
        //now a is at the centre of the LL, while b is at end.
        //now we have to reverse the LL from a till end and then check it one by one from start.
        a = reverseLL(a);
        b = head;
        while(a!=null){
            if(b.val!=a.val) return false;
            a = a.next;
            b = b.next;
        }
        return true;
    }

    public ListNode reverseLL(ListNode head){
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
