package Medium_Problems;


public class add_numbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head= new ListNode(0);
        ListNode l3 = head;
        int carry = 0;
        while(l1!=null || l2!=null){
            int l1_val = (l1!=null)?l1.val:0;
            int l2_val = (l2!=null)?l2.val:0;
            int sum = l1_val+l2_val+carry;
            carry = sum/10;
            sum = sum%10;
            l3.next = new ListNode(sum);
            l3 = l3.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            l3 = l3.next;
        }
        if(carry>0){
            l3.next = new ListNode(carry);
            l3 = l3.next;
        }
        return head.next;
    }
}