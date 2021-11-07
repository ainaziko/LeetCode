public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        if(head == null) return null;
        ListNode currNode = head;
        while (currNode != null && currNode.next != null){
            if(currNode.next.val == val){
                currNode.next = currNode.next.next;
            }else {
                currNode = currNode.next;
            }
        }
        return head;
    }
    public ListNode removeElementss(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        if (head == null) return null;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
