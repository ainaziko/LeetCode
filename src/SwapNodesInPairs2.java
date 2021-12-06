public class SwapNodesInPairs2 {
    public ListNode swapPairs(ListNode head) {
        ListNode ans = new ListNode(-1);
        ans.next = head;

        ListNode prev = ans;

        while (head != null && head.next != null){
            ListNode f = head;
            ListNode s = head.next;

            prev.next = s;
            f.next = s.next;
            s.next = f;
            prev = f;

            head = f.next;
        }
        return ans.next;
    }
}
