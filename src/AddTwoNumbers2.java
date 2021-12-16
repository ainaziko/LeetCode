public class AddTwoNumbers2 {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         l1 = reverse(l1);
         l2 = reverse(l2);
         int carry = 0;
         ListNode head = null;

         while (l1 != null || l2 != null){
             int x = l1 != null ? l1.val : 0;
             int y = l2 != null ? l2.val : 0;

             int val = (carry + x + y) % 10;
             carry = (carry + x + y) / 10;

             ListNode node = new ListNode(val);
             node.next = head;
             head = node;

             l1 = l1 != null ? l1.next : null;
             l2 = l2 != null ? l2.next : null;
         }

         if(carry != 0){
             ListNode node = new ListNode(carry);
             node.next = head;
             head = node;
         }
         return head;
    }

    public ListNode reverse(ListNode head){
        ListNode last = null;

        while (head != null){
            ListNode tmp = head.next;
            head.next = last;
            last = head;
            head = tmp;
        }
        return last;
    }
}