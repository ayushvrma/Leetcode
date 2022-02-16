package Algorithms_1.Day_5;
//  Definition for singly-linked list.

public class middle_of_LL {
    
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode p = head;
        while (p.next != null) {
            length++;
            p = p.next;
        }
        p = head;
        if (length % 2 == 0) {
            for (int i = 0; i < length / 2; i++) {
                p = p.next;
            }
        } else {
            for (int i = 0; i <= length / 2; i++) {
                p = p.next;
            }
        }
        return p;
    }
}
