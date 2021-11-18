public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ansHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = ansHead;
        int cary = 0;

        while (p != null || q != null){
            int x = p != null? p.val : 0;
            int y = q != null? q.val : 0;
            int sum = x + y + cary;
            cary = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(cary > 0){
            curr.next = new ListNode(cary);
        }
        return ansHead.next;
    }

/*            while (p != null && q != null){
        int add = (p.val + q.val)%10;
        carry = (p.val + q.val)/10;
        curr.val = add + carry;
        carry = 0;
        p = p.next;
        q = q.next;
        ListNode next = new ListNode(0);
        curr.next = next;
        curr = curr.next;
    }*/
}
