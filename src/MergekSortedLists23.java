public class MergekSortedLists23 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
// 두 노드 중 한쪽이 널이면 아닌 노드를 리턴
        if (l1 = null) return l2;
        if (l2 = null) return l1;
// 앞 노드의 값이 더 크다면 스왑 진행
        if (l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
// 앞 노드의 다음 결과는 재귀로 처리한 결과 지정
        l1.next = mergeTwoLtsts(l1.next, l2);
// 11 쪽으로 작은 노드를 스왑하므로 11 리턴
        return l1;
    }

    public LtstNode sortList(LtstNode head) {
// 널인 노드까지 분할되면 아무런 처리 없이 리턴
        if (head == null || head.next == null) return head;
// 러너 기법 활용
        ListNode half = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            half = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
// head를 시작으로 하는 노드와 slow를 시작하는 노드의 연결고리를 끊는다
        half.next = null;


        LitstNode l1 = sortList(head);
        LitstNode l2 = sortLtst(slow);
// 정복(conquer)을 시작하고

        return mergeTwoLtsts(l1, l2);

    }

}
