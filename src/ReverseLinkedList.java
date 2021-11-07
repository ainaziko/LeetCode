public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }//this part (detailed)
        ListNode prevN = head;
        ListNode currNode = head.next;
        prevN.next = null;
        while (currNode != null){ //why not (currNode.next != null)?
            ListNode tmpNext = currNode.next;
            ListNode tmpPrev = currNode;
            currNode.next = prevN;
            currNode = tmpNext;
            prevN = tmpPrev;
        }
        return prevN; //why prev Node
    }
}
