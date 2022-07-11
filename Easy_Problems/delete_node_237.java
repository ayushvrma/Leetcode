package Easy_Problems;

public class delete_node_237 {
    public void deleteNode(ListNode node) {
        if(node==null) return null;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}