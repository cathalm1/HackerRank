

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode c1 = head1;
        SinglyLinkedListNode c2 = head2;
        while(c1 != c2) {
            //c1 = c1.next != null ? c1.next : head2;
            //c2 = c2.next != null ? c2.next : head1;
            if(c1.next != null) c1 = c1.next;
            else c1 = head2;
            if(c2.next != null) c2 = c2.next;
            else c2 = head1;
    }
    return c1.data;
 }

