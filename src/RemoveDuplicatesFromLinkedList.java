public class RemoveDuplicatesFromLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode currNode = head;

        while (currNode.next != null){
            if(currNode.val == currNode.next.val){
                currNode.next = currNode.next.next;
            }else {
                currNode = currNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        //ListNode node2 = new ListNode(3);
        //ListNode node3 = new ListNode(2);
        head.next = node;
        node.next = node1;
        //node1.next = node2;
        //node2.next = node3;

        RemoveDuplicatesFromLinkedList rem = new RemoveDuplicatesFromLinkedList();
        System.out.println(rem.deleteDuplicates3(head));
    }

    public ListNode deleteDuplicates1(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode prevNode = head;
        ListNode currNode = head.next;
        while (currNode != null){
            if(sb.toString().contains(Integer.toString(currNode.val))){
                System.out.println(sb);
                prevNode.next = currNode.next;
            }else {
                sb.append(currNode.val);
            }
            prevNode.next = prevNode.next.next;
            currNode = currNode.next;
        }
        return prevNode;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode currNode = head;
        sb.append(currNode.val);

        while (currNode.next != null){
            System.out.println(sb);
            System.out.println(currNode + " curr");
            System.out.println(currNode.next + " next");
            if(sb.toString().contains(Integer.toString(currNode.next.val))){
                System.out.println("Contains" + currNode.next.val);
                //System.out.println(currNode.next + " next");
                //System.out.println(currNode.next.next + " next next");
                //System.out.println(sb + " sb");
                currNode.next = currNode.next.next;

            }else {
                sb.append(currNode.next.val);
            }
        }
        return currNode;
    }

    public ListNode deleteDuplicates3(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode currNode = head;
        sb.append(currNode.val);

        while (currNode != null){
            if(sb.toString().contains(currNode.next.val + "")){
                System.out.println(sb + " " + currNode);
                currNode.next = currNode.next.next;
                currNode = currNode.next.next;
            }else {
                sb.append(currNode.next.val);
                currNode = currNode.next;
            }
        }
        return head;
    }
}
