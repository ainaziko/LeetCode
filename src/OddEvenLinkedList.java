public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(7);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        OddEvenLinkedList o = new OddEvenLinkedList();

        System.out.println(o.oddEvenList(head));
    }

    public ListNode oddEvenList1(ListNode head) {
        ListNode p1 = head;
        ListNode head2 = head.next;

        while (p1 != null && p1.next != null){
            p1.next = p1.next.next;
            p1 = p1.next;
        }
        System.out.println(head);

/*        while (p2.next.next != null){
            p2.next = p2.next.next;
            p2 = p2.next.next;
        }*/
        //System.out.println(p2);
        return p1;
    }
}
