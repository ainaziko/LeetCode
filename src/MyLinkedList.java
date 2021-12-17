package December;

class MyLinkedList {

    ListNode head;
    int size;


    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode ans = head;

        for(int i = 0; i < index + 1; ++i) ans = ans.next;
        return ans.val;
    }


    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index < 0) index = 0;

        ++size;
        ListNode curr = head;
        for(int i = 0; i < index; ++i){
            curr = curr.next;
        }

        ListNode add = new ListNode(val);
        add.next = curr.next;
        curr.next = add;

    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        ListNode curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
