class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (true) {
            ListNode end = prev;

            for (int i = 0; i < k && end != null; i++)
                end = end.next;

            if (end == null) break;

            ListNode cur = prev.next;

            for (int i = 1; i < k; i++) {
                ListNode next = cur.next;
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }

            prev = cur;
        }

        return dummy.next;
    }
}
