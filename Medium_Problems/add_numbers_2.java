package Medium_Problems;


public class add_numbers_2 {
    int count=0;
    public void add(ListNode l1, ListNode l2, int count){
        l1.val += l2.val;
        if(l1.val>=10){
            count = l1.val/10;
            l1.val = l1.val%10;
        }
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        ListNode head=l1;
        add(l1, l2, count);
        return head;

    }
}