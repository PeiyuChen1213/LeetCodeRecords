package org.example;

/**
 * leetcode 206
 * 反转链表
 */
public class L206 {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        //利用双指针法解决这个问题
        //初始化两个指针
        ListNode pre = null;
        ListNode curr = head;
        ListNode temp = null;

        while (curr != null) {
            // curr->next的值要被改变所以需要有一个临时变量来储存这个元素
            temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
}
