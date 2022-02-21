package Easy_Problems;

public class merge_sort {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        if(list1==null&&list2==null)
            return null;
        if(list2==null)
            return list1;
        if(list1==null)
            return list2;
        if(list1.val<=list2.val){
            head = list1;
            list1 = list1.next;
        }
        else{
            head = list2;
            list2 = list2.next;
        }
        ListNode list3 = head;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list3.next = list1;
                list1 = list1.next;
                list3 = list3.next;
            }
            else{
                list3.next = list2;
                list2 = list2.next;
                list3 = list3.next;
            }
        }
            if(list1==null){
            while(list2.next!=null){
            list3.next = list2;
            list2 = list2.next;
            list3 = list3.next;
            }
            if(list2.next==null)
            list3.next = list2;
        }
        else if(list2==null){
            while(list1.next!=null){
            list3.next = list1;
            list1 = list1.next;
            list3 = list3.next;
            }
            if(list1.next==null)
            list3.next = list1;
            list3 = list3.next;
        }
        return head;
    }
}
