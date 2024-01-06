# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy_head = ListNode()  # 가상의 머리 노드 생성
        current = dummy_head     # 현재 노드를 가상의 머리 노드로 초기화
        carry = 0                # 올림 값 초기화

        while l1 or l2 or carry:
            x = l1.val if l1 else 0
            y = l2.val if l2 else 0

            _sum = x + y + carry   # 현재 자릿수의 합 및 올림 값 계산
            carry = _sum // 10     # 다음 자릿수로 넘어갈 올림 값 계산

            current.next = ListNode(_sum % 10)  # 현재 자릿수의 값으로 새로운 노드 생성
            current = current.next               # 현재 노드를 다음 노드로 이동

            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        return dummy_head.next  # 가상의 머리 노드의 다음 노드부터 실제 결과를 반환