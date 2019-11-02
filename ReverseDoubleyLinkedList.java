

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        System.out.println(head.data);
        if(head.next==null) return head;
        DoublyLinkedListNode rev = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
