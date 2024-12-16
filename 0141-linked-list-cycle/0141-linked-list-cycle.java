/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head; // 포인터를 두 칸씩 이동할 리스트
        ListNode slow = head; // 포인터를 한 칸씩 이동할 리스트

        // fast의 현재 노드나 다음 노드가 먼저 null에 도달하게 된다면
        // Cycle이 존재하지 않는 리스트
        while(fast != null && fast.next != null){
            // fast의 포인터를 두 칸씩 이동
            fast = fast.next.next;
            // slow의 포인터를 한 칸씩 이동
            slow = slow.next;

            // Cycle이 존재한다면 Cycle안에서 두 포인터가 언젠가는 만나게 됨
            if(fast == slow){
                return true;
            }
        }

        return false;
    }
}
