class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b)->a.val-b.val);
        for (ListNode x : lists) if (x != null) q.add(x);

        ListNode d = new ListNode(0), c = d;
        while (!q.isEmpty()) {
            c.next = q.poll();
            c = c.next;
            if (c.next != null) q.add(c.next);
        }
        return d.next;
    }
}
