public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next == null) return head;

        int n;
        ListNode oldTail = head;
        for(n = 1; oldTail.next != null; n++){
            oldTail = oldTail.next;
        }
        oldTail.next = head;

        ListNode newTail = head;
        for(int i = 0; i < n - k % n -1; i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public ListNode rotateRightM(ListNode head, int k) {
        int n = countNodes(head);
        int breakPoint = n - k;
        int counter = 0;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode ans = new ListNode(0);

        while (p1 != null){
            if(counter == n){
                p1.next = head;
            }
            if(counter < breakPoint){
                p1 = p2;
                ans.next = p1;
                p2 = p1.next;
                counter++;
            }
            if(counter == breakPoint){
                p1.next = null;
                p1 = p2;
                p2 = p1.next;
                counter++;
            }
        }
        return ans.next;
    }

    public static int countNodes(ListNode head){
        int counter = 1;
        ListNode currNode = head;
        while (currNode.next != null){
            counter++;
            currNode = currNode.next;
        }
        return counter;
    }
}
