package org.example;

/**
 * 移除链表元素
 */
public class L203 {
    public static void main(String[] args) {


    }

    public static ListNode removeEle(ListNode head, int val) {
        //处理头节点就是我们要删除的元素的情况
        while (head != null && head.val == val) {
            head = head.next;
        }
        //处理头节点的情况,如果头节点是空的，则提前结束头节点
        if (head == null) {
            return head;
        }

        //处理完头节点开始处理常规情况
        ListNode pre = head;
        ListNode curr = head.next;
        while (curr != null) {
            if (curr.val == val) {
                //执行删除操作
                pre.next = curr.next;
            } else {
                pre = pre.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
