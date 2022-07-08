package Easy_Problems;

public class LL_cycle_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode tail = head;
        ListNode hare = head.next;
        while (hare != tail) {
            if (hare == null || hare.next == null)
                return false;
            hare = hare.next.next;
            tail = tail.next;
        }
        return true;
    }
}
