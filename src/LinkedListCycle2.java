public class LinkedListCycle2 {

    public ListNode getIntersect(ListNode head){
        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null){
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise == hare) return tortoise;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;


        ListNode intersect = getIntersect(head);
        if(intersect == null) return  null;

        ListNode p1 = head;
        ListNode p2 = intersect;
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
